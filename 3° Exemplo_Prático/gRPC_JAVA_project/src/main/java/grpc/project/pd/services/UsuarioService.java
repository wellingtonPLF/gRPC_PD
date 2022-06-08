package grpc.project.pd.services;

import io.grpc.stub.StreamObserver;
import grpc.project.pd.protos.Usuario;
import grpc.project.pd.protos.UserIdRequest;
import grpc.project.pd.protos.UserResponse;
import grpc.project.pd.protos.UsuarioProtoGrpc.UsuarioProtoImplBase;

public class UsuarioService extends UsuarioProtoImplBase{
	
	public void usuarioPorId (UserIdRequest idRequest, StreamObserver<UserResponse> userResponse) {
		Integer id = idRequest.getId();
		UserResponse.Builder reply = UserResponse.newBuilder();
		Usuario user = Usuario.newBuilder().setId(id).setNome("Meu-Nome").build();
		reply.setUser(user);
		userResponse.onNext(reply.build());
		userResponse.onCompleted();
	}
}
