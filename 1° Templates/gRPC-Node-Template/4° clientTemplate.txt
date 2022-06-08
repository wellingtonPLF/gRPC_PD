import path from "path";
import * as grpc from '@grpc/grpc-js'
import * as protoLoader from '@grpc/proto-loader'
import { ProtoGrpcType } from './protoBuf/usuario'

const PORT = 3333;
const PROTO_FILE = './proto/usuario.proto'

const packageDef = protoLoader.loadSync(path.resolve(__dirname, PROTO_FILE))
const grpcObj = (grpc.loadPackageDefinition(packageDef) as unknown) as ProtoGrpcType

const client = new grpcObj.usuarioProto.UsuarioProto(
    `0.0.0.0:${PORT}`, grpc.credentials.createInsecure()
)

const deadline = new Date()
deadline.setSeconds(deadline.getSeconds() + 5)

client.waitForReady(deadline, (err: any) => {
    if (err) {
        console.error(err)
        return
    }

    onClientReady()
})

const onClientReady = () => {
    client.usuarioPorId({ id: 1}, (err: any, result: any) => {
        if (err) {
            console.error(err)
            return
        }
        console.log("Result: ", result)
    })
}