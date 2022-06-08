// Original file: src/proto/usuario.proto

import type * as grpc from '@grpc/grpc-js'
import type { MethodDefinition } from '@grpc/proto-loader'
import type { UserIdRequest as _usuarioProto_UserIdRequest, UserIdRequest__Output as _usuarioProto_UserIdRequest__Output } from '../usuarioProto/UserIdRequest';
import type { UserResponse as _usuarioProto_UserResponse, UserResponse__Output as _usuarioProto_UserResponse__Output } from '../usuarioProto/UserResponse';

export interface UsuarioProtoClient extends grpc.Client {
  usuarioPorId(argument: _usuarioProto_UserIdRequest, metadata: grpc.Metadata, options: grpc.CallOptions, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  usuarioPorId(argument: _usuarioProto_UserIdRequest, metadata: grpc.Metadata, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  usuarioPorId(argument: _usuarioProto_UserIdRequest, options: grpc.CallOptions, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  usuarioPorId(argument: _usuarioProto_UserIdRequest, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  usuarioPorId(argument: _usuarioProto_UserIdRequest, metadata: grpc.Metadata, options: grpc.CallOptions, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  usuarioPorId(argument: _usuarioProto_UserIdRequest, metadata: grpc.Metadata, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  usuarioPorId(argument: _usuarioProto_UserIdRequest, options: grpc.CallOptions, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  usuarioPorId(argument: _usuarioProto_UserIdRequest, callback: grpc.requestCallback<_usuarioProto_UserResponse__Output>): grpc.ClientUnaryCall;
  
}

export interface UsuarioProtoHandlers extends grpc.UntypedServiceImplementation {
  usuarioPorId: grpc.handleUnaryCall<_usuarioProto_UserIdRequest__Output, _usuarioProto_UserResponse>;
  
}

export interface UsuarioProtoDefinition extends grpc.ServiceDefinition {
  usuarioPorId: MethodDefinition<_usuarioProto_UserIdRequest, _usuarioProto_UserResponse, _usuarioProto_UserIdRequest__Output, _usuarioProto_UserResponse__Output>
}
