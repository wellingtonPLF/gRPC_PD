import * as grpc from '@grpc/grpc-js'
import { UserService, usuarioPorId } from './services/UsuarioService'

const PORT = 3333;

const main = () => {
    const server = new grpc.Server()
    server.addService(UserService, { usuarioPorId })

    server.bindAsync(`localhost:${PORT}`, grpc.ServerCredentials.createInsecure(),
    (err: any, port: number) => {
        if (err) {
            console.error(err)
            return 
        }
        console.log(`Your server has started on port ${port}`)
        server.start()
    })
}

main()