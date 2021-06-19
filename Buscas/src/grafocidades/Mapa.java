/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafocidades;

/**
 *
 *@author Elton Alves
 */
public class Mapa {
    private Cidade arad;             //#1
    private Cidade buscharest;       //#2
    private Cidade craiova;          //#3
    private Cidade dobreta;          //#4
    private Cidade eforie;           //#5
    private Cidade fagaras;          //#6
    private Cidade giurgiu;          //#7
    private Cidade hirsova;          //#8
    private Cidade iasi;             //#9
    private Cidade lugoj;            //#10
    private Cidade mehadia;          //#11
    private Cidade neamt;            //#12
    private Cidade oradea;           //#13
    private Cidade pitesti;          //#14
    private Cidade rimnicuVilcea;    //#15  
    private Cidade sibiu;            //#16
    private Cidade timisoara;        //#17
    private Cidade urziceni;         //#18
    private Cidade vaslui;           //#19
    private Cidade zerid;            //#20
    

    public Mapa() {
        //Passando cada variavel cidade e criando um objeto.
        arad = new Cidade("Arad");
        buscharest = new Cidade("Buscharest");
        craiova = new Cidade("Craiova");
        dobreta = new Cidade("Dobreta");
        eforie = new Cidade("Eforie");
        fagaras = new Cidade("Fagaras");
        giurgiu = new Cidade("Giurgiu");
        hirsova = new Cidade("Hirsova");
        iasi = new Cidade("Iasi");
        lugoj = new Cidade("Lugoj");
        mehadia = new Cidade("Mehadia");
        neamt = new Cidade("Neamt");
        oradea = new Cidade("Oradea");
        pitesti = new Cidade("Pitesti");
        rimnicuVilcea = new Cidade("Rimnicu Vilcea");
        sibiu = new Cidade("Sibiu");
        timisoara = new Cidade("Timisoara");
        urziceni = new Cidade("Urziceni");
        vaslui = new Cidade("Vaslui");
        zerid = new Cidade("Zerid");
        
        //Adicionando as cidades adjacentes
        //Adicionando as cidades adjacentes
        arad.addCidadeAdjacente(new Adjacente(zerid));
        arad.addCidadeAdjacente(new Adjacente(timisoara));
        arad.addCidadeAdjacente(new Adjacente(sibiu));
        
        buscharest.addCidadeAdjacente(new Adjacente(fagaras));
        buscharest.addCidadeAdjacente(new Adjacente(pitesti));
        buscharest.addCidadeAdjacente(new Adjacente(giurgiu));
        buscharest.addCidadeAdjacente(new Adjacente(urziceni));
    
        craiova.addCidadeAdjacente(new Adjacente(dobreta));
        craiova.addCidadeAdjacente(new Adjacente(rimnicuVilcea));
        craiova.addCidadeAdjacente(new Adjacente(pitesti));
        
        dobreta.addCidadeAdjacente(new Adjacente(mehadia));
        dobreta.addCidadeAdjacente(new Adjacente(craiova));
        
        eforie.addCidadeAdjacente(new Adjacente(hirsova));
        
        fagaras.addCidadeAdjacente(new Adjacente(sibiu));
        fagaras.addCidadeAdjacente(new Adjacente(buscharest));
        
        giurgiu.addCidadeAdjacente(new Adjacente(buscharest));
        
        hirsova.addCidadeAdjacente(new Adjacente(urziceni));
        hirsova.addCidadeAdjacente(new Adjacente(eforie));
        
        iasi.addCidadeAdjacente(new Adjacente(neamt));
        iasi.addCidadeAdjacente(new Adjacente(vaslui));
        
        lugoj.addCidadeAdjacente(new Adjacente(mehadia));
        lugoj.addCidadeAdjacente(new Adjacente(timisoara));
        
        mehadia.addCidadeAdjacente(new Adjacente(lugoj));
        mehadia.addCidadeAdjacente(new Adjacente(dobreta));
        
        neamt.addCidadeAdjacente(new Adjacente(iasi));
        
        oradea.addCidadeAdjacente(new Adjacente(sibiu));
        oradea.addCidadeAdjacente(new Adjacente(zerid));
        
        pitesti.addCidadeAdjacente(new Adjacente(rimnicuVilcea));
        pitesti.addCidadeAdjacente(new Adjacente(craiova));
        pitesti.addCidadeAdjacente(new Adjacente(buscharest));
        
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(sibiu));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(pitesti));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(craiova));
        
        sibiu.addCidadeAdjacente(new Adjacente(arad));
        sibiu.addCidadeAdjacente(new Adjacente(oradea));
        sibiu.addCidadeAdjacente(new Adjacente(fagaras));
        sibiu.addCidadeAdjacente(new Adjacente(rimnicuVilcea));
        
        timisoara.addCidadeAdjacente(new Adjacente(arad));
        timisoara.addCidadeAdjacente(new Adjacente(lugoj));
        
        urziceni.addCidadeAdjacente(new Adjacente(buscharest));
        urziceni.addCidadeAdjacente(new Adjacente(vaslui));
        urziceni.addCidadeAdjacente(new Adjacente(hirsova));
        
        vaslui.addCidadeAdjacente(new Adjacente(iasi));
        vaslui.addCidadeAdjacente(new Adjacente(urziceni));
        
        zerid.addCidadeAdjacente(new Adjacente(arad));
        zerid.addCidadeAdjacente(new Adjacente(oradea));
    }   

    /**
     * @return the arad
     */
    public Cidade getArad() {
        return arad;
    }

    /**
     * @param arad the arad to set
     */
    public void setArad(Cidade arad) {
        this.arad = arad;
    }

    /**
     * @return the buscharest
     */
    public Cidade getBuscharest() {
        return buscharest;
    }

    /**
     * @param buscharest the buscharest to set
     */
    public void setBuscharest(Cidade buscharest) {
        this.buscharest = buscharest;
    }

    /**
     * @return the craiova
     */
    public Cidade getCraiova() {
        return craiova;
    }

    /**
     * @param craiova the craiova to set
     */
    public void setCraiova(Cidade craiova) {
        this.craiova = craiova;
    }

    /**
     * @return the dobreta
     */
    public Cidade getDobreta() {
        return dobreta;
    }

    /**
     * @param dobreta the dobreta to set
     */
    public void setDobreta(Cidade dobreta) {
        this.dobreta = dobreta;
    }

    /**
     * @return the eforie
     */
    public Cidade getEforie() {
        return eforie;
    }

    /**
     * @param eforie the eforie to set
     */
    public void setEforie(Cidade eforie) {
        this.eforie = eforie;
    }

    /**
     * @return the fagaras
     */
    public Cidade getFagaras() {
        return fagaras;
    }

    /**
     * @param fagaras the fagaras to set
     */
    public void setFagaras(Cidade fagaras) {
        this.fagaras = fagaras;
    }

    /**
     * @return the giurgiu
     */
    public Cidade getGiurgiu() {
        return giurgiu;
    }

    /**
     * @param giurgiu the giurgiu to set
     */
    public void setGiurgiu(Cidade giurgiu) {
        this.giurgiu = giurgiu;
    }

    /**
     * @return the hirsova
     */
    public Cidade getHirsova() {
        return hirsova;
    }

    /**
     * @param hirsova the hirsova to set
     */
    public void setHirsova(Cidade hirsova) {
        this.hirsova = hirsova;
    }

    /**
     * @return the iasi
     */
    public Cidade getIasi() {
        return iasi;
    }

    /**
     * @param iasi the iasi to set
     */
    public void setIasi(Cidade iasi) {
        this.iasi = iasi;
    }

    /**
     * @return the lugoj
     */
    public Cidade getLugoj() {
        return lugoj;
    }

    /**
     * @param lugoj the lugoj to set
     */
    public void setLugoj(Cidade lugoj) {
        this.lugoj = lugoj;
    }

    /**
     * @return the mehadia
     */
    public Cidade getMehadia() {
        return mehadia;
    }

    /**
     * @param mehadia the mehadia to set
     */
    public void setMehadia(Cidade mehadia) {
        this.mehadia = mehadia;
    }

    /**
     * @return the neamt
     */
    public Cidade getNeamt() {
        return neamt;
    }

    /**
     * @param neamt the neamt to set
     */
    public void setNeamt(Cidade neamt) {
        this.neamt = neamt;
    }

    /**
     * @return the oradea
     */
    public Cidade getOradea() {
        return oradea;
    }

    /**
     * @param oradea the oradea to set
     */
    public void setOradea(Cidade oradea) {
        this.oradea = oradea;
    }

    /**
     * @return the pitesti
     */
    public Cidade getPitesti() {
        return pitesti;
    }

    /**
     * @param pitesti the pitesti to set
     */
    public void setPitesti(Cidade pitesti) {
        this.pitesti = pitesti;
    }

    /**
     * @return the rimnicuVilcea
     */
    public Cidade getRimnicuVilcea() {
        return rimnicuVilcea;
    }

    /**
     * @param rimnicuVilcea the rimnicuVilcea to set
     */
    public void setRimnicuVilcea(Cidade rimnicuVilcea) {
        this.rimnicuVilcea = rimnicuVilcea;
    }

    /**
     * @return the sibiu
     */
    public Cidade getSibiu() {
        return sibiu;
    }

    /**
     * @param sibiu the sibiu to set
     */
    public void setSibiu(Cidade sibiu) {
        this.sibiu = sibiu;
    }

    /**
     * @return the timisoara
     */
    public Cidade getTimisoara() {
        return timisoara;
    }

    /**
     * @param timisoara the timisoara to set
     */
    public void setTimisoara(Cidade timisoara) {
        this.timisoara = timisoara;
    }

    /**
     * @return the urziceni
     */
    public Cidade getUrziceni() {
        return urziceni;
    }

    /**
     * @param urziceni the urziceni to set
     */
    public void setUrziceni(Cidade urziceni) {
        this.urziceni = urziceni;
    }

    /**
     * @return the vaslui
     */
    public Cidade getVaslui() {
        return vaslui;
    }

    /**
     * @param vaslui the vaslui to set
     */
    public void setVaslui(Cidade vaslui) {
        this.vaslui = vaslui;
    }

    /**
     * @return the zerid
     */
    public Cidade getZerid() {
        return zerid;
    }

    /**
     * @param zerid the zerid to set
     */
    public void setZerid(Cidade zerid) {
        this.zerid = zerid;
    }
 

}
