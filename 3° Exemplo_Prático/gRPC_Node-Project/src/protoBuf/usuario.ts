import type * as grpc from '@grpc/grpc-js';
import type { MessageTypeDefinition } from '@grpc/proto-loader';

import type { UsuarioProtoClient as _usuarioProto_UsuarioProtoClient, UsuarioProtoDefinition as _usuarioProto_UsuarioProtoDefinition } from './usuarioProto/UsuarioProto';

type SubtypeConstructor<Constructor extends new (...args: any) => any, Subtype> = {
  new(...args: ConstructorParameters<Constructor>): Subtype;
};

export interface ProtoGrpcType {
  usuarioProto: {
    UserIdRequest: MessageTypeDefinition
    UserListResponse: MessageTypeDefinition
    UserRequest: MessageTypeDefinition
    UserResponse: MessageTypeDefinition
    Usuario: MessageTypeDefinition
    UsuarioProto: SubtypeConstructor<typeof grpc.Client, _usuarioProto_UsuarioProtoClient> & { service: _usuarioProto_UsuarioProtoDefinition }
    Void: MessageTypeDefinition
  }
}

