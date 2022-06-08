export class UsuarioModel{
    private _id: number;
    private _nome: string;

    constructor(id: number, nome: string) {
        this._id = id;
        this._nome = nome;
    }

    get id(){
        return this._id
    }

    set id(id){
        this._id = id;
    }

    get nome(){
        return this._nome
    }

    set nome(nome){
        this._nome = nome;
    }
}