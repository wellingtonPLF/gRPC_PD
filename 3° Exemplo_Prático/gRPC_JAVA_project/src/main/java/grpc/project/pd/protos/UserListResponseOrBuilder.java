// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: usuario.proto

package grpc.project.pd.protos;

public interface UserListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:usuarioProto.UserListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .usuarioProto.Usuario users = 1;</code>
   */
  java.util.List<grpc.project.pd.protos.Usuario> 
      getUsersList();
  /**
   * <code>repeated .usuarioProto.Usuario users = 1;</code>
   */
  grpc.project.pd.protos.Usuario getUsers(int index);
  /**
   * <code>repeated .usuarioProto.Usuario users = 1;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .usuarioProto.Usuario users = 1;</code>
   */
  java.util.List<? extends grpc.project.pd.protos.UsuarioOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .usuarioProto.Usuario users = 1;</code>
   */
  grpc.project.pd.protos.UsuarioOrBuilder getUsersOrBuilder(
      int index);
}
