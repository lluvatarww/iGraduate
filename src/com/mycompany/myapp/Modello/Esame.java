/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.Modello;

import com.codename1.io.Externalizable;
import com.codename1.io.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author derrik
 */
public class Esame implements Externalizable{

    private String ID;
    private String nome;
    private int voto;
    private float crediti;
    private boolean idoneita;
    private boolean lode;
    private Calendar data;
    private String note;

    public Esame() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public float getCrediti() {
        return crediti;
    }

    public void setCrediti(float crediti) {
        this.crediti = crediti;
    }

    public boolean isIdoneita() {
        return idoneita;
    }

    public void setIdoneita(boolean idoneita) {
        this.idoneita = idoneita;
    }

    public boolean isLode() {
        return lode;
    }

    public void setLode(boolean lode) {
        this.lode = lode;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
    
    @Override
    public int getVersion() {
       return 1;
    }

    @Override
    public void externalize(DataOutputStream out) throws IOException {
        Util.writeUTF(ID, out);
        Util.writeUTF(this.nome, out);
        Util.writeUTF(this.note, out);
        Util.writeObject(this.data, out);
        Util.writeObject(this.voto, out);
        Util.writeObject(this.crediti, out);
        Util.writeObject(this.idoneita, out);
        Util.writeObject(this.lode, out);
    }

    @Override
    public void internalize(int version, DataInputStream in) throws IOException {
      this.ID = Util.readUTF(in);
      this.nome = Util.readUTF(in);
       this.note = Util.readUTF(in);
       this.data = (Calendar)Util.readObject(in);
       this.voto = (int)Util.readObject(in);
       this.crediti = (float)Util.readObject(in);
       this.idoneita =(boolean) Util.readObject(in);
       this.lode = (boolean)Util.readObject(in);
        
    }

    @Override
    public String getObjectId() {
       return this.ID;
    }
    
}
