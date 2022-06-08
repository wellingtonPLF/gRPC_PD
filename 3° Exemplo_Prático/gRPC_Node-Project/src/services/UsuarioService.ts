import path from "path";
import * as grpc from '@grpc/grpc-js'
import * as protoLoader from '@grpc/proto-loader'
import { ProtoGrpcType } from '../protoBuf/usuario'
import { UsuarioModel } from "../model/Usuario"

const usuario = [ 
    new UsuarioModel(1, "Wellington")
]

const PROTO_FILE = '../proto/usuario.proto'

const packageDef = protoLoader.loadSync(path.resolve(__dirname, PROTO_FILE))
const grpcObj = (grpc.loadPackageDefinition(packageDef) as unknown) as ProtoGrpcType
const usuarioPackage = grpcObj.usuarioProto

export const UserService = usuarioPackage.UsuarioProto.service

export const usuarioPorId = ({request: { id }}: any, res: any) => {
    const user = usuario.find( (u) => u.id === id )
    if (!user){
        return res(new Error('Not found'), null)
    }
    console.log("Done!")
    return res(null, { user })
}
