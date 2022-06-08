package grpc.project.pd;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import grpc.project.pd.services.UsuarioService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ApplicationServer {
	
	  private static final Logger logger = Logger.getLogger(ApplicationServer.class.getName());

	  private final int port;
	  private final Server server;
	
	  public ApplicationServer(int port) throws IOException {
	    this(ServerBuilder.forPort(port), port);
	  }
	
	  /** Create a RouteGuide server using serverBuilder as a base and features as data. */
	  public ApplicationServer(ServerBuilder<?> serverBuilder, int port) {
	    this.port = port;
	    server = serverBuilder.addService(new UsuarioService()).build();
	  }
	
	  /** Start serving requests. */
	  public void start() throws IOException {
	    server.start();
	    logger.info("Server started, listening on " + port);
	    Runtime.getRuntime().addShutdownHook(new Thread() {
	      @Override
	      public void run() {
	        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
	        System.err.println("*** shutting down gRPC server since JVM is shutting down");
	        try {
	          ApplicationServer.this.stop();
	        } catch (InterruptedException e) {
	          e.printStackTrace(System.err);
	        }
	        System.err.println("*** server shut down");
	      }
	    });
	  }
	
	  /** Stop serving requests and shutdown resources. */
	  public void stop() throws InterruptedException {
	    if (server != null) {
	      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
	    }
	  }
	
	  /**
	   * Await termination on the main thread since the grpc library uses daemon threads.
	   */
	  private void blockUntilShutdown() throws InterruptedException {
	    if (server != null) {
	      server.awaitTermination();
	    }
	  }
	
	  /**
	   * Main method.  This comment makes the linter happy.
	   */
	  public static void main(String[] args) throws Exception {
		ApplicationServer server = new ApplicationServer(3335);
	    server.start();
	    server.blockUntilShutdown();
	  }

}
	  