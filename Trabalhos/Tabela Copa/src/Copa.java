import javax.swing.*;
import java.util.*;

public class Copa {
    private Time ecuador = new Time("Equador", new ImageIcon(System.getProperty("user.dir") + "/icons/equador.png"), System.getProperty("user.dir") + "/icons/equador.png");
    private Time netherlands = new Time("Holanda", new ImageIcon(System.getProperty("user.dir") + "/icons/holanda.png"), System.getProperty("user.dir") + "/icons/holanda.png");
    private Time qatar = new Time("Catar", new ImageIcon(System.getProperty("user.dir") + "/icons/catar.png"), System.getProperty("user.dir") + "/icons/catar.png");
    private Time senegal = new Time("Senegal",  new ImageIcon(System.getProperty("user.dir") + "/icons/senegal.png"), System.getProperty("user.dir") + "/icons/senegal.png");
    private Time usa = new Time("Estados Unidos", new ImageIcon(System.getProperty("user.dir") + "/icons/eua.png"), System.getProperty("user.dir") + "/icons/eua.png");
    private Time england = new Time("Inglaterra", new ImageIcon(System.getProperty("user.dir") + "/icons/inglaterra.png"), System.getProperty("user.dir") + "/icons/inglaterra.png");
    private Time wales = new Time("Gales", new ImageIcon(System.getProperty("user.dir") + "/icons/gales.png"), System.getProperty("user.dir") + "/icons/gales.png");
    private Time iran = new Time("Irã", new ImageIcon(System.getProperty("user.dir") + "/icons/ira.png"), System.getProperty("user.dir") + "/icons/ira.png");
    private Time mexico = new Time("México", new ImageIcon(System.getProperty("user.dir") + "/icons/mexico.png"), System.getProperty("user.dir") + "/icons/mexico.png");
    private Time argentina = new Time("Argentina", new ImageIcon(System.getProperty("user.dir") + "/icons/argentina.png"), System.getProperty("user.dir") + "/icons/argentina.png");
    private Time poland = new Time("Polônia", new ImageIcon(System.getProperty("user.dir") + "/icons/polonia.png"), System.getProperty("user.dir") + "/icons/polonia.png");
    private Time arabia = new Time("Arabia Saudita", new ImageIcon(System.getProperty("user.dir") + "/icons/arabia saudita.png"), System.getProperty("user.dir") + "/icons/arabia saudita.png");
    private Time australia = new Time("Austrália", new ImageIcon(System.getProperty("user.dir") + "/icons/australia.png"), System.getProperty("user.dir") + "/icons/australia.png");
    private Time tunisia = new Time("Tunísia", new ImageIcon(System.getProperty("user.dir") + "/icons/tunisia.png"), System.getProperty("user.dir") + "/icons/tunisia.png");
    private Time france = new Time("França", new ImageIcon(System.getProperty("user.dir") + "/icons/franca.png"), System.getProperty("user.dir") + "/icons/franca.png");
    private Time denmark = new Time("Dinamarca", new ImageIcon(System.getProperty("user.dir") + "/icons/dinamarca.png"), System.getProperty("user.dir") + "/icons/dinamarca.png");
    private Time germany = new Time("Alemanha", new ImageIcon(System.getProperty("user.dir") + "/icons/alemanha.png"), System.getProperty("user.dir") + "/icons/alemanha.png");
    private Time japan = new Time("Japão", new ImageIcon(System.getProperty("user.dir") + "/icons/japao.png"), System.getProperty("user.dir") + "/icons/japao.png");
    private Time spain = new Time("Espanha", new ImageIcon(System.getProperty("user.dir") + "/icons/espanha.png"), System.getProperty("user.dir") + "/icons/espanha.png");
    private Time costarica = new Time("Costa Rica", new ImageIcon(System.getProperty("user.dir") + "/icons/costa rica.png"), System.getProperty("user.dir") + "/icons/costa rica.png");
    private Time morocco = new Time("Marrocos", new ImageIcon(System.getProperty("user.dir") + "/icons/marrocos.png"), System.getProperty("user.dir") + "/icons/marrocos.png");
    private Time croatia = new Time("Croácia", new ImageIcon(System.getProperty("user.dir") + "/icons/croacia.png"), System.getProperty("user.dir") + "/icons/croacia.png");
    private Time belgium = new Time("Bélgica", new ImageIcon(System.getProperty("user.dir") + "/icons/belgica.png"), System.getProperty("user.dir") + "/icons/belgica.png");
    private Time canada = new Time("Canadá", new ImageIcon(System.getProperty("user.dir") + "/icons/canada.png"), System.getProperty("user.dir") + "/icons/canada.png");
    private Time switzerland = new Time("Suíça", new ImageIcon(System.getProperty("user.dir") + "/icons/suica.png"), System.getProperty("user.dir") + "/icons/suica.png");
    private Time cameroon = new Time("Camarões", new ImageIcon(System.getProperty("user.dir") + "/icons/camaroes.png"), System.getProperty("user.dir") + "/icons/camaroes.png");
    private Time brazil = new Time("Brasil", new ImageIcon(System.getProperty("user.dir") + "/icons/brasil.png"), System.getProperty("user.dir") + "/icons/brasil.png");
    private Time serbia = new Time("Sérvia", new ImageIcon(System.getProperty("user.dir") + "/icons/servia.png"), System.getProperty("user.dir") + "/icons/servia.png");
    private Time uruguay = new Time("Uruguai", new ImageIcon(System.getProperty("user.dir") + "/icons/uruguai.png"), System.getProperty("user.dir") + "/icons/uruguai.png");
    private Time korea = new Time("Coréia", new ImageIcon(System.getProperty("user.dir") + "/icons/coreia do sul.png"), System.getProperty("user.dir") + "/icons/coreia do sul.png");
    private Time portugal = new Time("Portugal", new ImageIcon(System.getProperty("user.dir") + "/icons/portugal.png"), System.getProperty("user.dir") + "/icons/portugal.png");
    private Time ghana = new Time("Gana", new ImageIcon(System.getProperty("user.dir") + "/icons/gana.png"), System.getProperty("user.dir") + "/icons/gana.png");

    //GrupoA
    private Partida p1 = new Partida(qatar, ecuador);
    private Partida p2 = new Partida(senegal, netherlands);
    private Partida p3 = new Partida(qatar, senegal);
    private Partida p4 = new Partida(netherlands, ecuador);
    private Partida p5 = new Partida(ecuador, senegal);
    private Partida p6 = new Partida(netherlands, qatar);

    //GrupoB
    private Partida p7 = new Partida(england, iran);
    private Partida p8 = new Partida(wales, usa);
    private Partida p9 = new Partida(wales, iran);
    private Partida p10 = new Partida(england, usa);
    private Partida p11 = new Partida(iran, usa);
    private Partida p12 = new Partida(wales, england);

    //GrupoC
    private Partida p13 = new Partida(argentina, arabia);
    private Partida p14 = new Partida(mexico, poland);
    private Partida p15 = new Partida(poland, arabia);
    private Partida p16 = new Partida(argentina, mexico);
    private Partida p17 = new Partida(poland, argentina);
    private Partida p18 = new Partida(arabia, mexico);

    //GrupoD
    private Partida p19 = new Partida(denmark, tunisia);
    private Partida p20 = new Partida(france, australia);
    private Partida p21 = new Partida(tunisia, australia);
    private Partida p22 = new Partida(france, denmark);
    private Partida p23 = new Partida(tunisia, france);
    private Partida p24 = new Partida(australia, denmark);

    //GrupoE
    private Partida p25 = new Partida(germany, japan);
    private Partida p26 = new Partida(spain, costarica);
    private Partida p27 = new Partida(japan, costarica);
    private Partida p28 = new Partida(spain, germany);
    private Partida p29 = new Partida(japan, spain);
    private Partida p30 = new Partida(costarica, germany);

    //GrupoF
    private Partida p31 = new Partida(morocco, croatia);
    private Partida p32 = new Partida(belgium, canada);
    private Partida p33 = new Partida(belgium, morocco);
    private Partida p34 = new Partida(croatia, canada);
    private Partida p35 = new Partida(canada, morocco);
    private Partida p36 = new Partida(croatia, belgium);

    //GrupoG
    private Partida p37 = new Partida(switzerland, cameroon);
    private Partida p38 = new Partida(brazil, serbia);
    private Partida p39 = new Partida(cameroon, serbia);
    private Partida p40 = new Partida(brazil, switzerland);
    private Partida p41 = new Partida(serbia, switzerland);
    private Partida p42 = new Partida(cameroon, brazil);

    //GrupoH
    private Partida p43 = new Partida(uruguay, korea);
    private Partida p44 = new Partida(portugal, ghana);
    private Partida p45 = new Partida(korea, ghana);
    private Partida p46 = new Partida(portugal, uruguay);
    private Partida p47 = new Partida(korea, portugal);
    private Partida p48 = new Partida(ghana, uruguay);

    private ArrayList<Partida> partidas = new ArrayList<Partida>();
    private ArrayList<Integer> numero = new ArrayList<>();

    public void setEcuador(Time ecuador) {
        this.ecuador = ecuador;
    }

    public void setNetherlands(Time netherlands) {
        this.netherlands = netherlands;
    }

    public void setQatar(Time qatar) {
        this.qatar = qatar;
    }

    public void setSenegal(Time senegal) {
        this.senegal = senegal;
    }

    public void setUsa(Time usa) {
        this.usa = usa;
    }

    public void setEngland(Time england) {
        this.england = england;
    }

    public void setWales(Time wales) {
        this.wales = wales;
    }

    public void setIran(Time iran) {
        this.iran = iran;
    }

    public void setMexico(Time mexico) {
        this.mexico = mexico;
    }

    public void setArgentina(Time argentina) {
        this.argentina = argentina;
    }

    public void setPoland(Time poland) {
        this.poland = poland;
    }

    public void setArabia(Time arabia) {
        this.arabia = arabia;
    }

    public void setAustralia(Time australia) {
        this.australia = australia;
    }

    public void setTunisia(Time tunisia) {
        this.tunisia = tunisia;
    }

    public void setFrance(Time france) {
        this.france = france;
    }

    public void setDenmark(Time denmark) {
        this.denmark = denmark;
    }

    public void setGermany(Time germany) {
        this.germany = germany;
    }

    public void setJapan(Time japan) {
        this.japan = japan;
    }

    public void setSpain(Time spain) {
        this.spain = spain;
    }

    public void setCostarica(Time costarica) {
        this.costarica = costarica;
    }

    public void setMorocco(Time morocco) {
        this.morocco = morocco;
    }

    public void setCroatia(Time croatia) {
        this.croatia = croatia;
    }

    public void setBelgium(Time belgium) {
        this.belgium = belgium;
    }

    public void setCanada(Time canada) {
        this.canada = canada;
    }

    public void setSwitzerland(Time switzerland) {
        this.switzerland = switzerland;
    }

    public void setCameroon(Time cameroon) {
        this.cameroon = cameroon;
    }

    public void setBrazil(Time brazil) {
        this.brazil = brazil;
    }

    public void setSerbia(Time serbia) {
        this.serbia = serbia;
    }

    public void setUruguay(Time uruguay) {
        this.uruguay = uruguay;
    }

    public void setKorea(Time korea) {
        this.korea = korea;
    }

    public void setPortugal(Time portugal) {
        this.portugal = portugal;
    }

    public void setGhana(Time ghana) {
        this.ghana = ghana;
    }

    public void setP1(Partida p1) {
        this.p1 = p1;
    }

    public void setP2(Partida p2) {
        this.p2 = p2;
    }

    public void setP3(Partida p3) {
        this.p3 = p3;
    }

    public void setP4(Partida p4) {
        this.p4 = p4;
    }

    public void setP5(Partida p5) {
        this.p5 = p5;
    }

    public void setP6(Partida p6) {
        this.p6 = p6;
    }

    public void setP7(Partida p7) {
        this.p7 = p7;
    }

    public void setP8(Partida p8) {
        this.p8 = p8;
    }

    public void setP9(Partida p9) {
        this.p9 = p9;
    }

    public void setP10(Partida p10) {
        this.p10 = p10;
    }

    public void setP11(Partida p11) {
        this.p11 = p11;
    }

    public void setP12(Partida p12) {
        this.p12 = p12;
    }

    public void setP13(Partida p13) {
        this.p13 = p13;
    }

    public void setP14(Partida p14) {
        this.p14 = p14;
    }

    public void setP15(Partida p15) {
        this.p15 = p15;
    }

    public void setP16(Partida p16) {
        this.p16 = p16;
    }

    public void setP17(Partida p17) {
        this.p17 = p17;
    }

    public void setP18(Partida p18) {
        this.p18 = p18;
    }

    public void setP19(Partida p19) {
        this.p19 = p19;
    }

    public void setP20(Partida p20) {
        this.p20 = p20;
    }

    public void setP21(Partida p21) {
        this.p21 = p21;
    }

    public void setP22(Partida p22) {
        this.p22 = p22;
    }

    public void setP23(Partida p23) {
        this.p23 = p23;
    }

    public void setP24(Partida p24) {
        this.p24 = p24;
    }

    public void setP25(Partida p25) {
        this.p25 = p25;
    }

    public void setP26(Partida p26) {
        this.p26 = p26;
    }

    public void setP27(Partida p27) {
        this.p27 = p27;
    }

    public void setP28(Partida p28) {
        this.p28 = p28;
    }

    public void setP29(Partida p29) {
        this.p29 = p29;
    }

    public void setP30(Partida p30) {
        this.p30 = p30;
    }

    public void setP31(Partida p31) {
        this.p31 = p31;
    }

    public void setP32(Partida p32) {
        this.p32 = p32;
    }

    public void setP33(Partida p33) {
        this.p33 = p33;
    }

    public void setP34(Partida p34) {
        this.p34 = p34;
    }

    public void setP35(Partida p35) {
        this.p35 = p35;
    }

    public void setP36(Partida p36) {
        this.p36 = p36;
    }

    public void setP37(Partida p37) {
        this.p37 = p37;
    }

    public void setP38(Partida p38) {
        this.p38 = p38;
    }

    public void setP39(Partida p39) {
        this.p39 = p39;
    }

    public void setP40(Partida p40) {
        this.p40 = p40;
    }

    public void setP41(Partida p41) {
        this.p41 = p41;
    }

    public void setP42(Partida p42) {
        this.p42 = p42;
    }

    public void setP43(Partida p43) {
        this.p43 = p43;
    }

    public void setP44(Partida p44) {
        this.p44 = p44;
    }

    public void setP45(Partida p45) {
        this.p45 = p45;
    }

    public void setP46(Partida p46) {
        this.p46 = p46;
    }

    public void setP47(Partida p47) {
        this.p47 = p47;
    }

    public void setP48(Partida p48) {
        this.p48 = p48;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public void setNumero(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    public Time getEcuador() {
        return ecuador;
    }

    public Time getNetherlands() {
        return netherlands;
    }

    public Time getQatar() {
        return qatar;
    }

    public Time getSenegal() {
        return senegal;
    }

    public Time getUsa() {
        return usa;
    }

    public Time getEngland() {
        return england;
    }

    public Time getWales() {
        return wales;
    }

    public Time getIran() {
        return iran;
    }

    public Time getMexico() {
        return mexico;
    }

    public Time getArgentina() {
        return argentina;
    }

    public Time getPoland() {
        return poland;
    }

    public Time getArabia() {
        return arabia;
    }

    public Time getAustralia() {
        return australia;
    }

    public Time getTunisia() {
        return tunisia;
    }

    public Time getFrance() {
        return france;
    }

    public Time getDenmark() {
        return denmark;
    }

    public Time getGermany() {
        return germany;
    }

    public Time getJapan() {
        return japan;
    }

    public Time getSpain() {
        return spain;
    }

    public Time getCostarica() {
        return costarica;
    }

    public Time getMorocco() {
        return morocco;
    }

    public Time getCroatia() {
        return croatia;
    }

    public Time getBelgium() {
        return belgium;
    }

    public Time getCanada() {
        return canada;
    }

    public Time getSwitzerland() {
        return switzerland;
    }

    public Time getCameroon() {
        return cameroon;
    }

    public Time getBrazil() {
        return brazil;
    }

    public Time getSerbia() {
        return serbia;
    }

    public Time getUruguay() {
        return uruguay;
    }

    public Time getKorea() {
        return korea;
    }

    public Time getPortugal() {
        return portugal;
    }

    public Time getGhana() {
        return ghana;
    }

    public Partida getP1() {
        return p1;
    }

    public Partida getP2() {
        return p2;
    }

    public Partida getP3() {
        return p3;
    }

    public Partida getP4() {
        return p4;
    }

    public Partida getP5() {
        return p5;
    }

    public Partida getP6() {
        return p6;
    }

    public Partida getP7() {
        return p7;
    }

    public Partida getP8() {
        return p8;
    }

    public Partida getP9() {
        return p9;
    }

    public Partida getP10() {
        return p10;
    }

    public Partida getP11() {
        return p11;
    }

    public Partida getP12() {
        return p12;
    }

    public Partida getP13() {
        return p13;
    }

    public Partida getP14() {
        return p14;
    }

    public Partida getP15() {
        return p15;
    }

    public Partida getP16() {
        return p16;
    }

    public Partida getP17() {
        return p17;
    }

    public Partida getP18() {
        return p18;
    }

    public Partida getP19() {
        return p19;
    }

    public Partida getP20() {
        return p20;
    }

    public Partida getP21() {
        return p21;
    }

    public Partida getP22() {
        return p22;
    }

    public Partida getP23() {
        return p23;
    }

    public Partida getP24() {
        return p24;
    }

    public Partida getP25() {
        return p25;
    }

    public Partida getP26() {
        return p26;
    }

    public Partida getP27() {
        return p27;
    }

    public Partida getP28() {
        return p28;
    }

    public Partida getP29() {
        return p29;
    }

    public Partida getP30() {
        return p30;
    }

    public Partida getP31() {
        return p31;
    }

    public Partida getP32() {
        return p32;
    }

    public Partida getP33() {
        return p33;
    }

    public Partida getP34() {
        return p34;
    }

    public Partida getP35() {
        return p35;
    }

    public Partida getP36() {
        return p36;
    }

    public Partida getP37() {
        return p37;
    }

    public Partida getP38() {
        return p38;
    }

    public Partida getP39() {
        return p39;
    }

    public Partida getP40() {
        return p40;
    }

    public Partida getP41() {
        return p41;
    }

    public Partida getP42() {
        return p42;
    }

    public Partida getP43() {
        return p43;
    }

    public Partida getP44() {
        return p44;
    }

    public Partida getP45() {
        return p45;
    }

    public Partida getP46() {
        return p46;
    }

    public Partida getP47() {
        return p47;
    }

    public Partida getP48() {
        return p48;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public ArrayList<Integer> getNumero() {
        return numero;
    }

    public Copa(){

        partidas.add(p1);
        partidas.add(p2);
        partidas.add(p3);
        partidas.add(p4);
        partidas.add(p5);
        partidas.add(p6);
        partidas.add(p7);
        partidas.add(p8);
        partidas.add(p9);
        partidas.add(p10);
        partidas.add(p11);
        partidas.add(p12);
        partidas.add(p13);
        partidas.add(p14);
        partidas.add(p15);
        partidas.add(p16);
        partidas.add(p17);
        partidas.add(p18);
        partidas.add(p19);
        partidas.add(p20);
        partidas.add(p21);
        partidas.add(p22);
        partidas.add(p23);
        partidas.add(p24);
        partidas.add(p25);
        partidas.add(p26);
        partidas.add(p27);
        partidas.add(p28);
        partidas.add(p29);
        partidas.add(p30);
        partidas.add(p31);
        partidas.add(p32);
        partidas.add(p33);
        partidas.add(p34);
        partidas.add(p35);
        partidas.add(p36);
        partidas.add(p37);
        partidas.add(p38);
        partidas.add(p39);
        partidas.add(p40);
        partidas.add(p41);
        partidas.add(p42);
        partidas.add(p43);
        partidas.add(p44);
        partidas.add(p45);
        partidas.add(p46);
        partidas.add(p47);
        partidas.add(p48);
        numero.add(1);
        numero.add(-1);

    }

}
