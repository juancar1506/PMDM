package com.example.Layouts;

public class Jugada {
    int jugadaUser;
    int jugadaBot;

    int Idpiedra,Idpapel,Idtijera;

    Jugada(int _Idpiedra, int _Idpapel,int _Idtijera) {
           this.Idpiedra = _Idpiedra;
           this.Idpapel = _Idpapel;
           this.Idtijera = _Idtijera;
    }

    public void setJugadaBot(int jugadaBot) {
        this.jugadaBot = jugadaBot;
    }

    public void setJugadaUser(int jugadaUser) {
        this.jugadaUser = jugadaUser;
    }

    public int getJugadaBot() {
        return jugadaBot;
    }

    public int getJugadaUser() {
        return jugadaUser;
    }

    public int getResultado () {
        //Usuario piedra
        if(this.getJugadaUser() == this.Idpiedra && this.getJugadaBot() == this.Idtijera) {  // piedra > tijera
            return 1;
        }
        else if(this.getJugadaUser() == this.Idpiedra && this.getJugadaBot() == this.Idpapel) {  // piedra < papel
            return 2;
        }

        else if(this.getJugadaUser() == this.Idpiedra && this.getJugadaBot() == this.Idpiedra) {  // piedra =  piedra
            return 0;
        }

        //Usuario tijera

        if(this.getJugadaUser() == this.Idtijera && this.getJugadaBot() == this.Idtijera) {  // tijera = tijera
            return 0;
        }
        else if(this.getJugadaUser() == this.Idtijera  && this.getJugadaBot() == this.Idpapel) {  // tijera > papel
           return 1;
        }

        else if(this.getJugadaUser() == this.Idtijera  && this.getJugadaBot() == this.Idpiedra) {  // tijera <  piedra
            return 2;
        }


        //Usuario papel


        if(this.getJugadaUser() == this.Idpapel && this.getJugadaBot() == this.Idtijera) {  // papel < tijera
            return 2;
        }
        else if(this.getJugadaUser() == this.Idpapel && this.getJugadaBot() == this.Idpapel) {  // papel = papel
            return 0;
        }

        else if(this.getJugadaUser() == this.Idpapel && this.getJugadaBot() == this.Idpiedra) {  // papel >  piedra
            return 1;
        }
        return 0;
    }



}
