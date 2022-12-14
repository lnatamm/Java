import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Tabela {

    private Copa copa = new Copa();
    private JTabbedPane TabbedPanel;
    private JPanel GrupoA;
    private JPanel GrupoB;
    private JPanel GrupoC;
    private JPanel GrupoD;
    private JPanel GrupoE;
    private JPanel GrupoF;
    private JPanel GrupoG;
    private JPanel GrupoH;
    private JTextField CatarGolsXEquador;
    private JTextField EquadorGolsXCatar;
    private JTextField SenegalGolsXHolanda;
    private JTextField HolandaGolsXSenegal;
    private JTextField CatarGolsXSenegal;
    private JTextField SenegalGolsXCatar;
    private JTextField HolandaGolsXEquador;
    private JTextField EquadorGolsXHolanda;
    private JTextField EquadorGolsXSenegal;
    private JTextField SenegalGolsXEquador;
    private JTextField HolandaGolsXCatar;

    private JTextField CatarGolsXHolanda;

    private JTextField[] GrupoATexts = new JTextField[]{CatarGolsXEquador, EquadorGolsXCatar, SenegalGolsXHolanda, HolandaGolsXSenegal, CatarGolsXSenegal, SenegalGolsXCatar, HolandaGolsXEquador, EquadorGolsXHolanda, EquadorGolsXSenegal, SenegalGolsXEquador, HolandaGolsXCatar, CatarGolsXHolanda};
    private Time[] GrupoATimes = new Time[]{copa.getQatar(), copa.getEcuador(), copa.getSenegal(), copa.getNetherlands()};

    private JTextField InglaterraGolsXIra;
    private JTextField IraGolsXInglaterra;
    private JTextField GalesGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXGales;
    private JTextField GalesGolsXIra;
    private JTextField IraGolsXGales;
    private JTextField InglaterraGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXInglaterra;
    private JTextField IraGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXIra;
    private JTextField GalesGolsXInglaterra;
    private JTextField InglaterraGolsXGales;

    private JTextField[] GrupoBTexts = new JTextField[]{InglaterraGolsXIra, IraGolsXInglaterra, GalesGolsXEstadosUnidos, EstadosUnidosGolsXGales, GalesGolsXIra, IraGolsXGales, InglaterraGolsXEstadosUnidos, EstadosUnidosGolsXInglaterra, IraGolsXEstadosUnidos, EstadosUnidosGolsXIra, GalesGolsXInglaterra, InglaterraGolsXGales};

    private Time[] GrupoBTimes = new Time[]{copa.getEngland(), copa.getUsa(), copa.getIran(), copa.getWales()};

    private JTextField ArgentinaGolsXArabia;
    private JTextField ArabiaGolsXArgentina;
    private JTextField MexicoGolsXPolonia;
    private JTextField PoloniaGolsXMexico;
    private JTextField PoloniaGolsXArabia;
    private JTextField ArabiaGolsXPolonia;
    private JTextField ArgentinaGolsXMexico;
    private JTextField MexicoGolsXArgentina;
    private JTextField PoloniaGolsXArgentina;
    private JTextField ArgentinaGolsXPolonia;
    private JTextField ArabiaGolsXMexico;
    private JTextField MexicoGolsXArabia;

    private JTextField[] GrupoCTexts = new JTextField[]{ArgentinaGolsXArabia, ArabiaGolsXArgentina, MexicoGolsXPolonia, PoloniaGolsXMexico, PoloniaGolsXArabia, ArabiaGolsXPolonia, ArgentinaGolsXMexico, MexicoGolsXArgentina, PoloniaGolsXArgentina, ArgentinaGolsXPolonia, ArabiaGolsXMexico, MexicoGolsXArabia};

    private Time[] GrupoCTimes = new Time[]{copa.getArgentina(), copa.getPoland(), copa.getMexico(), copa.getArabia()};

    private JTextField AlemanhaGolsXJapao;
    private JTextField JapaoGolsXAlemanha;
    private JTextField EspanhaGolsXCostaRica;
    private JTextField CostaRicaGolsXEspanha;
    private JTextField JapaoGolsXCostaRica;
    private JTextField CostaRicaGolsXJapao;
    private JTextField EspanhaGolsXAlemanha;
    private JTextField AlemanhaGolsXEspanha;
    private JTextField JapaoGolsXEspanha;
    private JTextField EspanhaGolsXJapao;
    private JTextField CostaRicaGolsXAlemanha;
    private JTextField AlemanhaGolsXCostaRica;

    private JTextField[] GrupoETexts = new JTextField[]{AlemanhaGolsXJapao, JapaoGolsXAlemanha, EspanhaGolsXCostaRica, CostaRicaGolsXEspanha, JapaoGolsXCostaRica, CostaRicaGolsXJapao, EspanhaGolsXAlemanha, AlemanhaGolsXEspanha, JapaoGolsXEspanha, EspanhaGolsXJapao, CostaRicaGolsXAlemanha, AlemanhaGolsXCostaRica};

    private Time[] GrupoETimes = new Time[]{copa.getJapan(), copa.getSpain(), copa.getGermany(), copa.getCostarica()};

    private JTextField MarrocosGolsXCroacia;
    private JTextField CroaciaGolsXMarrocos;
    private JTextField BelgicaGolsXCanada;
    private JTextField CanadaGolsXBelgica;
    private JTextField BelgicaGolsXMarrocos;
    private JTextField MarrocosGolsXBelgica;
    private JTextField CroaciaGolsXCanada;
    private JTextField CanadaGolsXCroacia;
    private JTextField CanadaGolsXMarrocos;
    private JTextField MarrocosGolsXCanada;
    private JTextField CroaciaGolsXBelgica;
    private JTextField BelgicaGolsXCroacia;

    private JTextField[] GrupoFTexts = new JTextField[]{MarrocosGolsXCroacia, CroaciaGolsXMarrocos, BelgicaGolsXCanada, CanadaGolsXBelgica, BelgicaGolsXMarrocos, MarrocosGolsXBelgica, CroaciaGolsXCanada, CanadaGolsXCroacia, CanadaGolsXMarrocos, MarrocosGolsXCanada, CroaciaGolsXBelgica, BelgicaGolsXCroacia};

    private Time[] GrupoFTimes = new Time[]{copa.getMorocco(), copa.getCroatia(), copa.getBelgium(), copa.getCanada()};

    private JTextField SuicaGolsXCamaroes;
    private JTextField CamaroesGolsXSuica;
    private JTextField BrasilGolsXServia;
    private JTextField SerrviaGolsXBrasil;
    private JTextField CamaroesGolsXServia;
    private JTextField ServiaGolsXCamaroes;
    private JTextField BrasilGolsXSuica;
    private JTextField SuicaGolsXBrasil;
    private JTextField ServiaGolsXSuica;
    private JTextField SuicaGolsXServia;
    private JTextField CamaroesGolsXBrasil;
    private JTextField BrasilGolsXCamaroes;

    private JTextField[] GrupoGTexts = new JTextField[]{SuicaGolsXCamaroes, CamaroesGolsXSuica, BrasilGolsXServia, SerrviaGolsXBrasil, CamaroesGolsXServia, ServiaGolsXCamaroes, BrasilGolsXSuica, SuicaGolsXBrasil, ServiaGolsXSuica, SuicaGolsXServia, CamaroesGolsXBrasil, BrasilGolsXCamaroes};

    private Time[] GrupoGTimes = new Time[]{copa.getBrazil(), copa.getSwitzerland(), copa.getCameroon(), copa.getSerbia()};

    private JTextField UruguaiGolsXCoreia;
    private JTextField CoreiaGolsXUruguai;
    private JTextField PortugalGolsXGana;
    private JTextField GanaGolsXPortugal;
    private JTextField CoreiaGolsXGana;
    private JTextField GanaGolsXCoreia;
    private JTextField PortugalGolsXUruguai;
    private JTextField UruguaiGolsXPortugal;
    private JTextField CoreiaGolsXPortual;
    private JTextField PortugalGolsXCoreia;
    private JTextField GanaGolsXUruguai;
    private JTextField UruguaiGolsXGana;

    private JTextField[] GrupoHTexts = new JTextField[]{UruguaiGolsXCoreia, CoreiaGolsXUruguai, PortugalGolsXGana, GanaGolsXPortugal, CoreiaGolsXGana, GanaGolsXCoreia, PortugalGolsXUruguai, UruguaiGolsXPortugal, CoreiaGolsXPortual, PortugalGolsXCoreia, GanaGolsXUruguai, UruguaiGolsXGana};

    private Time[] GrupoHTimes = new Time[]{copa.getUruguay(), copa.getGhana(), copa.getPortugal(), copa.getKorea()};

    private JTextField DinamarcaGolsXTunisia;
    private JTextField TunisiaGolsXDinamarca;
    private JTextField FrancaGolsXAustralia;
    private JTextField AustraliaGolsXFranca;
    private JTextField TunisiaGolsXAustralia;
    private JTextField AustraliaGolsXTunisia;
    private JTextField FrancaGolsXDinamarca;
    private JTextField DinamarcaGolsXFranca;
    private JTextField TunisiaGolsXFranca;
    private JTextField FrancaGolsXTunisia;
    private JTextField AustraliaGolsXDinamarca;
    private JTextField DinamarcaGolsXAustralia;

    private JTextField[] GrupoDTexts = new JTextField[]{DinamarcaGolsXTunisia, TunisiaGolsXDinamarca, FrancaGolsXAustralia, AustraliaGolsXFranca, TunisiaGolsXAustralia, AustraliaGolsXTunisia, FrancaGolsXDinamarca, DinamarcaGolsXFranca, TunisiaGolsXFranca, FrancaGolsXTunisia, AustraliaGolsXDinamarca, DinamarcaGolsXAustralia};

    private Time[] GrupoDTimes = new Time[]{copa.getFrance(), copa.getAustralia(), copa.getTunisia(), copa.getDenmark()};

    private JLabel Time1GrupoA;
    private JLabel Time2GrupoA;
    private JLabel Time3GrupoA;
    private JLabel Time4GrupoA;
    private JLabel Time1GrupoB;
    private JLabel Time2GrupoB;
    private JLabel Time3GrupoB;
    private JLabel Time4GrupoB;
    private JLabel Time1GrupoC;
    private JLabel Time2GrupoC;
    private JLabel Time3GrupoC;
    private JLabel Time4GrupoC;
    private JLabel Time1GrupoD;
    private JLabel Time2GrupoD;
    private JLabel Time3GrupoD;
    private JLabel Time4GrupoD;
    private JLabel Time1GrupoE;
    private JLabel Time2GrupoE;
    private JLabel Time3GrupoE;
    private JLabel Time4GrupoE;
    private JLabel Time1GrupoF;
    private JLabel Time2GrupoF;
    private JLabel Time3GrupoF;
    private JLabel Time4GrupoF;
    private JLabel Time1GrupoG;
    private JLabel Time2GrupoG;
    private JLabel Time3GrupoG;
    private JLabel Time4GrupoG;
    private JLabel Time1GrupoH;
    private JLabel Time2GrupoH;
    private JLabel Time3GrupoH;
    private JLabel Time4GrupoH;
    private JLabel V1A;
    private JLabel E1A;
    private JLabel D1A;
    private JLabel GP1A;
    private JLabel GC1A;
    private JLabel SG1A;
    private JLabel V2A;
    private JLabel E2A;
    private JLabel D2A;
    private JLabel GP2A;
    private JLabel GC2A;
    private JLabel SG2A;
    private JLabel V3A;
    private JLabel E3A;
    private JLabel D3A;
    private JLabel GP3A;
    private JLabel GC3A;
    private JLabel SG3A;
    private JLabel V4A;
    private JLabel E4A;
    private JLabel D4A;
    private JLabel GP4A;
    private JLabel GC4A;
    private JLabel SG4A;
    private JLabel V1B;
    private JLabel E1B;
    private JLabel D1B;
    private JLabel GP1B;
    private JLabel GC1B;
    private JLabel SG1B;
    private JLabel V2B;
    private JLabel E2B;
    private JLabel D2B;
    private JLabel GP2B;
    private JLabel GC2B;
    private JLabel SG2B;
    private JLabel V3B;
    private JLabel E3B;
    private JLabel D3B;
    private JLabel GP3B;
    private JLabel GC3B;
    private JLabel SG3B;
    private JLabel V4B;
    private JLabel E4B;
    private JLabel D4B;
    private JLabel GP4B;
    private JLabel GC4B;
    private JLabel SG4B;
    private JLabel V1C;
    private JLabel E1C;
    private JLabel D1C;
    private JLabel GP1C;
    private JLabel GC1C;
    private JLabel SG1C;
    private JLabel V2C;
    private JLabel E2C;
    private JLabel D2C;
    private JLabel GP2C;
    private JLabel GC2C;
    private JLabel SG2C;
    private JLabel V3C;
    private JLabel E3C;
    private JLabel D3C;
    private JLabel GP3C;
    private JLabel GC3C;
    private JLabel SG3C;
    private JLabel V4C;
    private JLabel E4C;
    private JLabel D4C;
    private JLabel GP4C;
    private JLabel GC4C;
    private JLabel SG4C;
    private JLabel E1D;
    private JLabel V1D;
    private JLabel D1D;
    private JLabel GP1D;
    private JLabel GC1D;
    private JLabel SG1D;
    private JLabel V2D;
    private JLabel E2D;
    private JLabel D2D;
    private JLabel GP2D;
    private JLabel GC2D;
    private JLabel SG2D;
    private JLabel V3D;
    private JLabel E3D;
    private JLabel D3D;
    private JLabel GP3D;
    private JLabel GC3D;
    private JLabel SG3D;
    private JLabel V4D;
    private JLabel E4D;
    private JLabel D4D;
    private JLabel GP4D;
    private JLabel GC4D;
    private JLabel SG4D;
    private JLabel V1E;
    private JLabel E1E;
    private JLabel D1E;
    private JLabel GP1E;
    private JLabel GC1E;
    private JLabel SG1E;
    private JLabel V2E;
    private JLabel E2E;
    private JLabel D2E;
    private JLabel GP2E;
    private JLabel GC2E;
    private JLabel SG2E;
    private JLabel V3E;
    private JLabel E3E;
    private JLabel D3E;
    private JLabel GP3E;
    private JLabel GC3E;
    private JLabel SG3E;
    private JLabel V4E;
    private JLabel E4E;
    private JLabel D4E;
    private JLabel GP4E;
    private JLabel GC4E;
    private JLabel SG4E;
    private JLabel V1F;
    private JLabel E1F;
    private JLabel D1F;
    private JLabel GP1F;
    private JLabel GC1F;
    private JLabel SG1F;
    private JLabel V2F;
    private JLabel E2F;
    private JLabel D2F;
    private JLabel GP2F;
    private JLabel GC2F;
    private JLabel SG2F;
    private JLabel V3F;
    private JLabel E3F;
    private JLabel D3F;
    private JLabel GP3F;
    private JLabel GC3F;
    private JLabel SG3F;
    private JLabel V4F;
    private JLabel E4F;
    private JLabel D4F;
    private JLabel GP4F;
    private JLabel GC4F;
    private JLabel SG4F;
    private JLabel V1G;
    private JLabel E1G;
    private JLabel D1G;
    private JLabel GP1G;
    private JLabel GC1G;
    private JLabel SG1G;
    private JLabel V2G;
    private JLabel E2G;
    private JLabel D2G;
    private JLabel GP2G;
    private JLabel GC2G;
    private JLabel SG2G;
    private JLabel V3G;
    private JLabel E3G;
    private JLabel D3G;
    private JLabel GP3G;
    private JLabel GC3G;
    private JLabel SG3G;
    private JLabel V4G;
    private JLabel E4G;
    private JLabel D4G;
    private JLabel GP4G;
    private JLabel GC4G;
    private JLabel SG4G;
    private JLabel V1H;
    private JLabel E1H;
    private JLabel D1H;
    private JLabel GP1H;
    private JLabel GC1H;
    private JLabel SG1H;
    private JLabel V2H;
    private JLabel E2H;
    private JLabel D2H;
    private JLabel GP2H;
    private JLabel GC2H;
    private JLabel SG2H;
    private JLabel V3H;
    private JLabel E3H;
    private JLabel D3H;
    private JLabel GP3H;
    private JLabel GC3H;
    private JLabel SG3H;
    private JLabel V4H;
    private JLabel E4H;
    private JLabel D4H;
    private JLabel GP4H;
    private JLabel GC4H;
    private JLabel SG4H;
    private JPanel MataMata;
    private JButton enviarBotaoGrupoA;
    private JButton enviarBotaoGrupoB;
    private JButton enviarBotaoGrupoC;
    private JButton enviarBotaoGupoD;
    private JButton enviarBotaoGrupoE;
    private JButton enviarBotaoGrupoG;
    private JButton enviarBotaoGrupoH;
    private JButton enviarBotaoGupoF;
    private JLabel PTS1A;
    private JLabel PTS2A;
    private JLabel PTS3A;
    private JLabel PTS4A;
    private JLabel PTS1B;
    private JLabel PTS2B;
    private JLabel PTS3B;
    private JLabel PTS4B;
    private JLabel PTS1C;
    private JLabel PTS2C;
    private JLabel PTS3C;
    private JLabel PTS4C;
    private JLabel PTS1D;
    private JLabel PTS2D;
    private JLabel PTS3D;
    private JLabel PTS4D;
    private JLabel PTS1E;
    private JLabel PTS2E;
    private JLabel PTS3E;
    private JLabel PTS4E;
    private JLabel PTS1F;
    private JLabel PTS2F;
    private JLabel PTS3F;
    private JLabel PTS4F;
    private JLabel PTS1G;
    private JLabel PTS2G;
    private JLabel PTS3G;
    private JLabel PTS4G;
    private JLabel PTS1H;
    private JLabel PTS2H;
    private JLabel PTS3H;
    private JLabel PTS4H;
    private JTextField Gols1Oitavas1;
    private JTextField Gols2Oitavas1;
    private JTextField Gols1Oitavas2;
    private JTextField Gols2Oitavas2;
    private JTextField Gols1Oitavas3;
    private JTextField Gols2Oitavas3;
    private JTextField Gols1Oitavas4;
    private JTextField Gols2Oitavas4;
    private JTextField Gols1Quartas1;
    private JTextField Gols2Quartas1;
    private JTextField Gols1Quartas2;
    private JTextField Gols2Quartas2;
    private JTextField Gols1Semi1;
    private JTextField Gols2Semi1;
    private JTextField Gols1Oitavas5;
    private JTextField Gols2Oitavas5;
    private JTextField Gols1Oitavas6;
    private JTextField Gols2Oitavas6;
    private JTextField Gols1Oitavas7;
    private JTextField Gols2Oitavas7;
    private JTextField Gols1Oitavas8;
    private JTextField Gols2Oitavas8;
    private JTextField Gols1Quartas3;
    private JTextField Gols2Quartas3;
    private JTextField Gols2Quartas4;
    private JTextField Gols1Quartas4;
    private JTextField Gols2Semi2;
    private JTextField Gols1Semi2;
    private JTextField Gols1Final;
    private JTextField Gols2Final;
    private JTextField Gols2Terceiro;
    private JTextField Gols1Terceiro;
    private JTextField Penaltis1Oitavas1;
    private JTextField Penaltis2Oitavas1;
    private JTextField Penaltis1Oitavas2;
    private JTextField Penaltis2Oitavas2;
    private JTextField Penaltis1Oitavas3;
    private JTextField Penaltis2Oitavas3;
    private JTextField Penaltis1Oitavas4;
    private JTextField Penaltis2Oitavas4;
    private JTextField Penaltis1Quartas1;
    private JTextField Penaltis2Quartas1;
    private JTextField Penaltis1Quartas2;
    private JTextField Penaltis2Quartas2;
    private JTextField Penaltis1Semi1;
    private JTextField Penaltis2Semi1;
    private JTextField Penaltis1Oitavas5;
    private JTextField Penaltis2Oitavas5;
    private JTextField Penaltis1Oitavas6;
    private JTextField Penaltis2Oitavas6;
    private JTextField Penaltis1Oitavas7;
    private JTextField Penaltis2Oitavas7;
    private JTextField Penaltis1Oitavas8;
    private JTextField Penaltis2Oitavas8;
    private JTextField Penaltis1Quartas3;
    private JTextField Penaltis2Quartas3;
    private JTextField Penaltis1Quartas4;
    private JTextField Penaltis2Quartas4;
    private JTextField Penaltis1Semi2;
    private JTextField Penaltis2Semi2;
    private JLabel A1;
    private JLabel B2;
    private JLabel C1;
    private JLabel D2;
    private JLabel E1;
    private JLabel F2;
    private JLabel G1;
    private JLabel H2;
    private JLabel B1;
    private JLabel A2;
    private JLabel D1;
    private JLabel C2;
    private JLabel F1;
    private JLabel E2;
    private JLabel H1;
    private JLabel G2;
    private JLabel VencedorOitavas1;
    private JLabel VencedorOitavas2;
    private JLabel VencedorOitavas3;
    private JLabel VencedorOitavas4;
    private JLabel VencedorOitavas5;
    private JLabel VencedorOitavas6;
    private JLabel VencedorOitavas7;
    private JLabel VencedorOitavas8;
    private JLabel VencedorQuartas1;
    private JLabel VencedorQuartas2;
    private JLabel VencedorQuartas3;
    private JLabel VencedorQuartas4;
    private JLabel VencedorSemi1;
    private JLabel VencedorSemi2;
    private JLabel PerderdorSemi1;
    private JLabel PerderdorSemi2;
    private JLabel VencedorFinal;
    private JLabel VencedorTerceiro;
    private JTextField Penaltis1Final;
    private JTextField Penaltis2Final;
    private JTextField Penaltis1Terceiro;
    private JTextField Penaltis2Terceiro;
    private JButton enviarOitavas1;
    private JButton enviarOitavas2;
    private JButton enviarOitavas3;
    private JButton enviarOitavas4;
    private JButton enviarQuartas1;
    private JButton enviarQuartas2;
    private JButton enviarSemi2;
    private JButton enviarQuartas3;
    private JButton enviarQuartas4;
    private JButton enviarSemi1;
    private JButton enviarOitavas5;
    private JButton enviarOitavas6;
    private JButton enviarOitavas7;
    private JButton enviarOitavas8;
    private JButton enviarFinal;
    private JButton enviarTerceira;
    private JButton Reset1;
    private JButton Reset2;
    private JButton Reset3;
    private JButton Reset4;
    private JButton Reset5;
    private JButton Reset6;
    private JButton Reset7;
    private JButton Reset8;
    private JButton Reset9;
    private JButton atualizarButton;
    private JLabel Catar1;
    private JLabel Catar2;
    private JLabel Catar3;
    private JLabel Equador1;
    private JLabel Equador2;
    private JLabel Equador3;
    private JLabel Senegal1;
    private JLabel Senegal2;
    private JLabel Senegal3;
    private JLabel Holanda1;
    private JLabel Holanda2;
    private JLabel Holanda3;
    private JLabel Inglaterra1;
    private JLabel Inglaterra2;
    private JLabel Inglaterra3;
    private JLabel Ira1;
    private JLabel Ira2;
    private JLabel Ira3;
    private JLabel Gales1;
    private JLabel Gales2;
    private JLabel Gales3;
    private JLabel Usa1;
    private JLabel Usa2;
    private JLabel Usa3;
    private JLabel Argentina1;
    private JLabel Argentina2;
    private JLabel Argentina3;
    private JLabel Arabia1;
    private JLabel Arabia2;
    private JLabel Arabia3;
    private JLabel Mexico1;
    private JLabel Mexico2;
    private JLabel Mexico3;
    private JLabel Polonia1;
    private JLabel Polonia2;
    private JLabel Polonia3;
    private JLabel Dinamarca1;
    private JLabel Dinamarca2;
    private JLabel Dinamarca3;
    private JLabel Tunisia1;
    private JLabel Tunisia2;
    private JLabel Tunisia3;
    private JLabel Franca1;
    private JLabel Franca2;
    private JLabel Franca3;
    private JLabel Australia1;
    private JLabel Australia2;
    private JLabel Australia3;
    private JLabel Alemanha1;
    private JLabel Alemanha2;
    private JLabel Alemanha3;
    private JLabel Japao1;
    private JLabel Japao2;
    private JLabel Japao3;
    private JLabel Espanha1;
    private JLabel Espanha2;
    private JLabel Espanha3;
    private JLabel Costa1;
    private JLabel Costa2;
    private JLabel Costa3;
    private JLabel Marrocos1;
    private JLabel Marrocos2;
    private JLabel Marrocos3;
    private JLabel Croacia1;
    private JLabel Croacia2;
    private JLabel Croacia3;
    private JLabel Belgica1;
    private JLabel Belgica2;
    private JLabel Belgica3;
    private JLabel Canada1;
    private JLabel Canada2;
    private JLabel Canada3;
    private JLabel Suica1;
    private JLabel Suica2;
    private JLabel Suica3;
    private JLabel Camaroes1;
    private JLabel Camaroes2;
    private JLabel Camaroes3;
    private JLabel Brasil1;
    private JLabel Brasil2;
    private JLabel Brasil3;
    private JLabel Servia1;
    private JLabel Servia2;
    private JLabel Servia3;
    private JLabel Uruguai1;
    private JLabel Uruguai2;
    private JLabel Uruguai3;
    private JLabel Coreia1;
    private JLabel Coreia2;
    private JLabel Coreia3;
    private JLabel Portugal1;
    private JLabel Portugal2;
    private JLabel Portugal3;
    private JLabel Gana1;
    private JLabel Gana2;
    private JLabel Gana3;
    private JLabel C1A;
    private JLabel C2A;
    private JLabel C3A;
    private JLabel C4A;
    private JLabel C1B;
    private JLabel C2B;
    private JLabel C3B;
    private JLabel C4B;
    private JLabel C1C;
    private JLabel C2C;
    private JLabel C3C;
    private JLabel C4C;
    private JLabel C1D;
    private JLabel C2D;
    private JLabel C3D;
    private JLabel C4D;
    private JLabel C1E;
    private JLabel C2E;
    private JLabel C3E;
    private JLabel C4E;
    private JLabel C1F;
    private JLabel C2F;
    private JLabel C3F;
    private JLabel C4F;
    private JLabel C1G;
    private JLabel C2G;
    private JLabel C3G;
    private JLabel C4G;
    private JLabel C1H;
    private JLabel C2H;
    private JLabel C3H;
    private JLabel C4H;

    private void Reset(){

        File arquivo = new File(System.getProperty("user.dir") + "/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            //Oitavas:
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            //Quartas
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            //Semis
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            //Final e Terceiro Lugar
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("1A");
            bw.newLine();
            bw.write("2B");
            bw.newLine();
            bw.write("1C");
            bw.newLine();
            bw.write("2D");
            bw.newLine();
            bw.write("1E");
            bw.newLine();
            bw.write("2F");
            bw.newLine();
            bw.write("1G");
            bw.newLine();
            bw.write("2H");
            bw.newLine();
            bw.write("1B");
            bw.newLine();
            bw.write("2A");
            bw.newLine();
            bw.write("1D");
            bw.newLine();
            bw.write("2C");
            bw.newLine();
            bw.write("1F");
            bw.newLine();
            bw.write("2E");
            bw.newLine();
            bw.write("1H");
            bw.newLine();
            bw.write("2G");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            //TabelaA
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            //TabelaB
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            //TabelaC
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0");
            bw.newLine();
            //TabelaD
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            //TabelaE
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            //TabelaF
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            //TabelaG
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            //TabelaH
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");
            bw.newLine();
            bw.write("A definir;0;0;0;0;0;0;0;");

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    private void Escrever(){
        File arquivo = new File(System.getProperty("user.dir") + "/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            //GrupoA
            bw.write(CatarGolsXEquador.getText() + ";" + EquadorGolsXCatar.getText());
            bw.newLine();
            bw.write(SenegalGolsXHolanda.getText() + ";" + HolandaGolsXSenegal.getText());
            bw.newLine();
            bw.write(CatarGolsXSenegal.getText() + ";" + SenegalGolsXCatar.getText());
            bw.newLine();
            bw.write(HolandaGolsXEquador.getText() + ";" + EquadorGolsXHolanda.getText());
            bw.newLine();
            bw.write(EquadorGolsXSenegal.getText() + ";" + SenegalGolsXEquador.getText());
            bw.newLine();
            bw.write(HolandaGolsXCatar.getText() + ";" + CatarGolsXHolanda.getText());
            bw.newLine();
            //GrupoB
            bw.write(InglaterraGolsXIra.getText() + ";" + IraGolsXInglaterra.getText());
            bw.newLine();
            bw.write(GalesGolsXEstadosUnidos.getText() + ";" + EstadosUnidosGolsXGales.getText());
            bw.newLine();
            bw.write(GalesGolsXIra.getText() + ";" + IraGolsXGales.getText());
            bw.newLine();
            bw.write(InglaterraGolsXEstadosUnidos.getText() + ";" + EstadosUnidosGolsXInglaterra.getText());
            bw.newLine();
            bw.write(IraGolsXEstadosUnidos.getText() + ";" + EstadosUnidosGolsXIra.getText());
            bw.newLine();
            bw.write(GalesGolsXInglaterra.getText() + ";" + InglaterraGolsXGales.getText());
            bw.newLine();
            //GrupoC
            bw.write(ArgentinaGolsXArabia.getText() + ";" + ArabiaGolsXArgentina.getText());
            bw.newLine();
            bw.write(MexicoGolsXPolonia.getText() + ";" + PoloniaGolsXMexico.getText());
            bw.newLine();
            bw.write(PoloniaGolsXArabia.getText() + ";" + ArabiaGolsXPolonia.getText());
            bw.newLine();
            bw.write(ArgentinaGolsXMexico.getText() + ";" + MexicoGolsXArgentina.getText());
            bw.newLine();
            bw.write(PoloniaGolsXArgentina.getText() + ";" + ArgentinaGolsXPolonia.getText());
            bw.newLine();
            bw.write(ArabiaGolsXMexico.getText() + ";" + MexicoGolsXArabia.getText());
            bw.newLine();
            //GrupoD
            bw.write(DinamarcaGolsXTunisia.getText() + ";" + TunisiaGolsXDinamarca.getText());
            bw.newLine();
            bw.write(FrancaGolsXAustralia.getText() + ";" + AustraliaGolsXFranca.getText());
            bw.newLine();
            bw.write(TunisiaGolsXAustralia.getText() + ";" + AustraliaGolsXTunisia.getText());
            bw.newLine();
            bw.write(FrancaGolsXDinamarca.getText() + ";" + DinamarcaGolsXFranca.getText());
            bw.newLine();
            bw.write(TunisiaGolsXFranca.getText() + ";" + FrancaGolsXTunisia.getText());
            bw.newLine();
            bw.write(AustraliaGolsXDinamarca.getText() + ";" + DinamarcaGolsXAustralia.getText());
            bw.newLine();
            //GrupoE
            bw.write(AlemanhaGolsXJapao.getText() + ";" + JapaoGolsXAlemanha.getText());
            bw.newLine();
            bw.write(EspanhaGolsXCostaRica.getText() + ";" + CostaRicaGolsXEspanha.getText());
            bw.newLine();
            bw.write(JapaoGolsXCostaRica.getText() + ";" + CostaRicaGolsXJapao.getText());
            bw.newLine();
            bw.write(EspanhaGolsXAlemanha.getText() + ";" + AlemanhaGolsXEspanha.getText());
            bw.newLine();
            bw.write(JapaoGolsXEspanha.getText() + ";" + EspanhaGolsXJapao.getText());
            bw.newLine();
            bw.write(CostaRicaGolsXAlemanha.getText() + ";" + AlemanhaGolsXCostaRica.getText());
            bw.newLine();
            //GrupoF
            bw.write(MarrocosGolsXCroacia.getText() + ";" + CroaciaGolsXMarrocos.getText());
            bw.newLine();
            bw.write(BelgicaGolsXCanada.getText() + ";" + CanadaGolsXBelgica.getText());
            bw.newLine();
            bw.write(BelgicaGolsXMarrocos.getText() + ";" + MarrocosGolsXBelgica.getText());
            bw.newLine();
            bw.write(CroaciaGolsXCanada.getText() + ";" + CanadaGolsXCroacia.getText());
            bw.newLine();
            bw.write(CanadaGolsXMarrocos.getText() + ";" + MarrocosGolsXCanada.getText());
            bw.newLine();
            bw.write(CroaciaGolsXBelgica.getText() + ";" + BelgicaGolsXCroacia.getText());
            bw.newLine();
            //GrupoG
            bw.write(SuicaGolsXCamaroes.getText() + ";" + CamaroesGolsXSuica.getText());
            bw.newLine();
            bw.write(BrasilGolsXServia.getText() + ";" + SerrviaGolsXBrasil.getText());
            bw.newLine();
            bw.write(CamaroesGolsXServia.getText() + ";" + ServiaGolsXCamaroes.getText());
            bw.newLine();
            bw.write(BrasilGolsXSuica.getText() + ";" + SuicaGolsXBrasil.getText());
            bw.newLine();
            bw.write(ServiaGolsXSuica.getText() + ";" + SuicaGolsXServia.getText());
            bw.newLine();
            bw.write(CamaroesGolsXBrasil.getText() + ";" + BrasilGolsXCamaroes.getText());
            bw.newLine();
            //GrupoH
            bw.write(UruguaiGolsXCoreia.getText() + ";" + CoreiaGolsXUruguai.getText());
            bw.newLine();
            bw.write(PortugalGolsXGana.getText() + ";" + GanaGolsXPortugal.getText());
            bw.newLine();
            bw.write(CoreiaGolsXGana.getText() + ";" + GanaGolsXCoreia.getText());
            bw.newLine();
            bw.write(PortugalGolsXUruguai.getText() + ";" + UruguaiGolsXPortugal.getText());
            bw.newLine();
            bw.write(CoreiaGolsXPortual.getText() + ";" + PortugalGolsXCoreia.getText());
            bw.newLine();
            bw.write(GanaGolsXUruguai.getText() + ";" + UruguaiGolsXGana.getText());
            bw.newLine();
            //Oitavas:
            bw.write(Gols1Oitavas1.getText() + ";" + Gols2Oitavas1.getText() + ";" + Penaltis1Oitavas1.getText() + ";" + Penaltis2Oitavas1.getText());
            bw.newLine();
            bw.write(Gols1Oitavas2.getText() + ";" + Gols2Oitavas2.getText() + ";" + Penaltis1Oitavas2.getText() + ";" + Penaltis2Oitavas2.getText());
            bw.newLine();
            bw.write(Gols1Oitavas3.getText() + ";" + Gols2Oitavas3.getText() + ";" + Penaltis1Oitavas3.getText() + ";" + Penaltis2Oitavas3.getText());
            bw.newLine();
            bw.write(Gols1Oitavas4.getText() + ";" + Gols2Oitavas4.getText() + ";" + Penaltis1Oitavas4.getText() + ";" + Penaltis2Oitavas4.getText());
            bw.newLine();
            bw.write(Gols1Oitavas5.getText() + ";" + Gols2Oitavas5.getText() + ";" + Penaltis1Oitavas5.getText() + ";" + Penaltis2Oitavas5.getText());
            bw.newLine();
            bw.write(Gols1Oitavas6.getText() + ";" + Gols2Oitavas6.getText() + ";" + Penaltis1Oitavas6.getText() + ";" + Penaltis2Oitavas6.getText());
            bw.newLine();
            bw.write(Gols1Oitavas7.getText() + ";" + Gols2Oitavas7.getText() + ";" + Penaltis1Oitavas7.getText() + ";" + Penaltis2Oitavas7.getText());
            bw.newLine();
            bw.write(Gols1Oitavas8.getText() + ";" + Gols2Oitavas8.getText() + ";" + Penaltis1Oitavas8.getText() + ";" + Penaltis2Oitavas8.getText());
            bw.newLine();
            //Quartas
            bw.write(Gols1Quartas1.getText() + ";" + Gols2Quartas1.getText() + ";" + Penaltis1Quartas1.getText() + ";" + Penaltis2Quartas1.getText());
            bw.newLine();
            bw.write(Gols1Quartas2.getText() + ";" + Gols2Quartas2.getText() + ";" + Penaltis1Quartas2.getText() + ";" + Penaltis2Quartas2.getText());
            bw.newLine();
            bw.write(Gols1Quartas3.getText() + ";" + Gols2Quartas3.getText() + ";" + Penaltis1Quartas3.getText() + ";" + Penaltis2Quartas3.getText());
            bw.newLine();
            bw.write(Gols1Quartas4.getText() + ";" + Gols2Quartas4.getText() + ";" + Penaltis1Quartas4.getText() + ";" + Penaltis2Quartas4.getText());
            bw.newLine();
            //Semis
            bw.write(Gols1Semi1.getText() + ";" + Gols2Semi1.getText() + ";" + Penaltis1Semi1.getText() + ";" + Penaltis2Semi1.getText());
            bw.newLine();
            bw.write(Gols1Semi2.getText() + ";" + Gols2Semi2.getText() + ";" + Penaltis1Semi2.getText() + ";" + Penaltis2Semi2.getText());
            bw.newLine();
            //Final e Terceiro Lugar
            bw.write(Gols1Final.getText() + ";" + Gols2Final.getText() + ";" + Penaltis1Final.getText() + ";" + Penaltis2Final.getText());
            bw.newLine();
            bw.write(Gols1Terceiro.getText() + ";" + Gols2Terceiro.getText() + ";" + Penaltis1Terceiro.getText() + ";" + Penaltis2Terceiro.getText());
            bw.newLine();
            bw.write(A1.getText());
            bw.newLine();
            bw.write(B2.getText());
            bw.newLine();
            bw.write(C1.getText());
            bw.newLine();
            bw.write(D2.getText());
            bw.newLine();
            bw.write(E1.getText());
            bw.newLine();
            bw.write(F2.getText());
            bw.newLine();
            bw.write(G1.getText());
            bw.newLine();
            bw.write(H2.getText());
            bw.newLine();
            bw.write(B1.getText());
            bw.newLine();
            bw.write(A2.getText());
            bw.newLine();
            bw.write(D1.getText());
            bw.newLine();
            bw.write(C2.getText());
            bw.newLine();
            bw.write(F1.getText());
            bw.newLine();
            bw.write(E2.getText());
            bw.newLine();
            bw.write(H1.getText());
            bw.newLine();
            bw.write(G2.getText());
            bw.newLine();
            bw.write(VencedorOitavas1.getText());
            bw.newLine();
            bw.write(VencedorOitavas2.getText());
            bw.newLine();
            bw.write(VencedorOitavas3.getText());
            bw.newLine();
            bw.write(VencedorOitavas4.getText());
            bw.newLine();
            bw.write(VencedorOitavas5.getText());
            bw.newLine();
            bw.write(VencedorOitavas6.getText());
            bw.newLine();
            bw.write(VencedorOitavas7.getText());
            bw.newLine();
            bw.write(VencedorOitavas8.getText());
            bw.newLine();
            bw.write(VencedorQuartas1.getText());
            bw.newLine();
            bw.write(VencedorQuartas2.getText());
            bw.newLine();
            bw.write(VencedorQuartas3.getText());
            bw.newLine();
            bw.write(VencedorQuartas4.getText());
            bw.newLine();
            bw.write(VencedorSemi1.getText());
            bw.newLine();
            bw.write(VencedorSemi2.getText());
            bw.newLine();
            bw.write(PerderdorSemi1.getText());
            bw.newLine();
            bw.write(PerderdorSemi2.getText());
            bw.newLine();
            bw.write(VencedorFinal.getText());
            bw.newLine();
            bw.write(VencedorTerceiro.getText());
            bw.newLine();
            //TabelaA
            bw.write(Time1GrupoA.getText() + ";" + V1A.getText() + ";" +  E1A.getText() + ";" + D1A.getText() + ";" + GP1A.getText() + ";" + GC1A.getText() + ";" + SG1A.getText() + ";" + PTS1A.getText() + ";" + C1A.getText());
            bw.newLine();
            bw.write(Time2GrupoA.getText() + ";" + V2A.getText() + ";" +  E2A.getText() + ";" + D2A.getText() + ";" + GP2A.getText() + ";" + GC2A.getText() + ";" + SG2A.getText() + ";" + PTS2A.getText() + ";" + C2A.getText());
            bw.newLine();
            bw.write(Time3GrupoA.getText() + ";" + V3A.getText() + ";" +  E3A.getText() + ";" + D3A.getText() + ";" + GP3A.getText() + ";" + GC3A.getText() + ";" + SG3A.getText() + ";" + PTS3A.getText() + ";" + C3A.getText());
            bw.newLine();
            bw.write(Time4GrupoA.getText() + ";" + V4A.getText() + ";" +  E4A.getText() + ";" + D4A.getText() + ";" + GP4A.getText() + ";" + GC4A.getText() + ";" + SG4A.getText() + ";" + PTS4A.getText() + ";" + C4A.getText());
            bw.newLine();
            //TabelaB
            bw.write(Time1GrupoB.getText() + ";" + V1B.getText() + ";" +  E1B.getText() + ";" + D1B.getText() + ";" + GP1B.getText() + ";" + GC1B.getText() + ";" + SG1B.getText() + ";" + PTS1B.getText() + ";" + C1B.getText());
            bw.newLine();
            bw.write(Time2GrupoB.getText() + ";" + V2B.getText() + ";" +  E2B.getText() + ";" + D2B.getText() + ";" + GP2B.getText() + ";" + GC2B.getText() + ";" + SG2B.getText() + ";" + PTS2B.getText() + ";" + C2B.getText());
            bw.newLine();
            bw.write(Time3GrupoB.getText() + ";" + V3B.getText() + ";" +  E3B.getText() + ";" + D3B.getText() + ";" + GP3B.getText() + ";" + GC3B.getText() + ";" + SG3B.getText() + ";" + PTS3B.getText() + ";" + C3B.getText());
            bw.newLine();
            bw.write(Time4GrupoB.getText() + ";" + V4B.getText() + ";" +  E4B.getText() + ";" + D4B.getText() + ";" + GP4B.getText() + ";" + GC4B.getText() + ";" + SG4B.getText() + ";" + PTS4B.getText() + ";" + C4B.getText());
            bw.newLine();
            //TabelaC
            bw.write(Time1GrupoC.getText() + ";" + V1C.getText() + ";" +  E1C.getText() + ";" + D1C.getText() + ";" + GP1C.getText() + ";" + GC1C.getText() + ";" + SG1C.getText() + ";" + PTS1C.getText() + ";" + C1C.getText());
            bw.newLine();
            bw.write(Time2GrupoC.getText() + ";" + V2C.getText() + ";" +  E2C.getText() + ";" + D2C.getText() + ";" + GP2C.getText() + ";" + GC2C.getText() + ";" + SG2C.getText() + ";" + PTS2C.getText() + ";" + C2C.getText());
            bw.newLine();
            bw.write(Time3GrupoC.getText() + ";" + V3C.getText() + ";" +  E3C.getText() + ";" + D3C.getText() + ";" + GP3C.getText() + ";" + GC3C.getText() + ";" + SG3C.getText() + ";" + PTS3C.getText() + ";" + C3C.getText());
            bw.newLine();
            bw.write(Time4GrupoC.getText() + ";" + V4C.getText() + ";" +  E4C.getText() + ";" + D4C.getText() + ";" + GP4C.getText() + ";" + GC4C.getText() + ";" + SG4C.getText() + ";" + PTS4C.getText() + ";" + C4C.getText());
            bw.newLine();
            //TabelaD
            bw.write(Time1GrupoD.getText() + ";" + V1D.getText() + ";" +  E1D.getText() + ";" + D1D.getText() + ";" + GP1D.getText() + ";" + GC1D.getText() + ";" + SG1D.getText() + ";" + PTS1D.getText() + ";" + C1D.getText());
            bw.newLine();
            bw.write(Time2GrupoD.getText() + ";" + V2D.getText() + ";" +  E2D.getText() + ";" + D2D.getText() + ";" + GP2D.getText() + ";" + GC2D.getText() + ";" + SG2D.getText() + ";" + PTS2D.getText() + ";" + C2D.getText());
            bw.newLine();
            bw.write(Time3GrupoD.getText() + ";" + V3D.getText() + ";" +  E3D.getText() + ";" + D3D.getText() + ";" + GP3D.getText() + ";" + GC3D.getText() + ";" + SG3D.getText() + ";" + PTS3D.getText() + ";" + C3D.getText());
            bw.newLine();
            bw.write(Time4GrupoD.getText() + ";" + V4D.getText() + ";" +  E4D.getText() + ";" + D4D.getText() + ";" + GP4D.getText() + ";" + GC4D.getText() + ";" + SG4D.getText() + ";" + PTS4D.getText() + ";" + C4D.getText());
            bw.newLine();
            //TabelaE
            bw.write(Time1GrupoE.getText() + ";" + V1E.getText() + ";" +  E1E.getText() + ";" + D1E.getText() + ";" + GP1E.getText() + ";" + GC1E.getText() + ";" + SG1E.getText() + ";" + PTS1E.getText() + ";" + C1E.getText());
            bw.newLine();
            bw.write(Time2GrupoE.getText() + ";" + V2E.getText() + ";" +  E2E.getText() + ";" + D2E.getText() + ";" + GP2E.getText() + ";" + GC2E.getText() + ";" + SG2E.getText() + ";" + PTS2E.getText() + ";" + C2E.getText());
            bw.newLine();
            bw.write(Time3GrupoE.getText() + ";" + V3E.getText() + ";" +  E3E.getText() + ";" + D3E.getText() + ";" + GP3E.getText() + ";" + GC3E.getText() + ";" + SG3E.getText() + ";" + PTS3E.getText() + ";" + C3E.getText());
            bw.newLine();
            bw.write(Time4GrupoE.getText() + ";" + V4E.getText() + ";" +  E4E.getText() + ";" + D4E.getText() + ";" + GP4E.getText() + ";" + GC4E.getText() + ";" + SG4E.getText() + ";" + PTS4E.getText() + ";" + C4E.getText());
            bw.newLine();
            //TabelaF
            bw.write(Time1GrupoF.getText() + ";" + V1F.getText() + ";" +  E1F.getText() + ";" + D1F.getText() + ";" + GP1F.getText() + ";" + GC1F.getText() + ";" + SG1F.getText() + ";" + PTS1F.getText() + ";" + C1F.getText());
            bw.newLine();
            bw.write(Time2GrupoF.getText() + ";" + V2F.getText() + ";" +  E2F.getText() + ";" + D2F.getText() + ";" + GP2F.getText() + ";" + GC2F.getText() + ";" + SG2F.getText() + ";" + PTS2F.getText() + ";" + C2F.getText());
            bw.newLine();
            bw.write(Time3GrupoF.getText() + ";" + V3F.getText() + ";" +  E3F.getText() + ";" + D3F.getText() + ";" + GP3F.getText() + ";" + GC3F.getText() + ";" + SG3F.getText() + ";" + PTS3F.getText() + ";" + C3F.getText());
            bw.newLine();
            bw.write(Time4GrupoF.getText() + ";" + V4F.getText() + ";" +  E4F.getText() + ";" + D4F.getText() + ";" + GP4F.getText() + ";" + GC4F.getText() + ";" + SG4F.getText() + ";" + PTS4F.getText() + ";" + C4F.getText());
            bw.newLine();
            //TabelaG
            bw.write(Time1GrupoG.getText() + ";" + V1G.getText() + ";" +  E1G.getText() + ";" + D1G.getText() + ";" + GP1G.getText() + ";" + GC1G.getText() + ";" + SG1G.getText() + ";" + PTS1G.getText() + ";" + C1G.getText());
            bw.newLine();
            bw.write(Time2GrupoG.getText() + ";" + V2G.getText() + ";" +  E2G.getText() + ";" + D2G.getText() + ";" + GP2G.getText() + ";" + GC2G.getText() + ";" + SG2G.getText() + ";" + PTS2G.getText() + ";" + C2G.getText());
            bw.newLine();
            bw.write(Time3GrupoG.getText() + ";" + V3G.getText() + ";" +  E3G.getText() + ";" + D3G.getText() + ";" + GP3G.getText() + ";" + GC3G.getText() + ";" + SG3G.getText() + ";" + PTS3G.getText() + ";" + C3G.getText());
            bw.newLine();
            bw.write(Time4GrupoG.getText() + ";" + V4G.getText() + ";" +  E4G.getText() + ";" + D4G.getText() + ";" + GP4G.getText() + ";" + GC4G.getText() + ";" + SG4G.getText() + ";" + PTS4G.getText() + ";" + C4G.getText());
            bw.newLine();
            //TabelaH
            bw.write(Time1GrupoH.getText() + ";" + V1H.getText() + ";" +  E1H.getText() + ";" + D1H.getText() + ";" + GP1H.getText() + ";" + GC1H.getText() + ";" + SG1H.getText() + ";" + PTS1H.getText() + ";" + C1H.getText());
            bw.newLine();
            bw.write(Time2GrupoH.getText() + ";" + V2H.getText() + ";" +  E2H.getText() + ";" + D2H.getText() + ";" + GP2H.getText() + ";" + GC2H.getText() + ";" + SG2H.getText() + ";" + PTS2H.getText() + ";" + C2H.getText());
            bw.newLine();
            bw.write(Time3GrupoH.getText() + ";" + V3H.getText() + ";" +  E3H.getText() + ";" + D3H.getText() + ";" + GP3H.getText() + ";" + GC3H.getText() + ";" + SG3H.getText() + ";" + PTS3H.getText() + ";" + C3H.getText());
            bw.newLine();
            bw.write(Time4GrupoH.getText() + ";" + V4H.getText() + ";" +  E4H.getText() + ";" + D4H.getText() + ";" + GP4H.getText() + ";" + GC4H.getText() + ";" + SG4H.getText() + ";" + PTS4H.getText() + ";" + C4H.getText());
            bw.newLine();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void Ler() throws FileNotFoundException {

        File arquivo = new File(System.getProperty("user.dir") + "/tabelaCopa.txt");
        Scanner sc = new Scanner(arquivo);
        try{
            if(arquivo.exists()){
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);

                for(int nLinha = 1 ; nLinha<=64;nLinha++){
                    String linha = sc.nextLine();
                    String[] linhaSplit = linha.split(";");

                    //GrupoA
                    if(nLinha == 1){
                        CatarGolsXEquador.setText(linhaSplit[0]);
                        EquadorGolsXCatar.setText(linhaSplit[1]);
                    }
                    if(nLinha == 2){
                        SenegalGolsXHolanda.setText(linhaSplit[0]);
                        HolandaGolsXSenegal.setText(linhaSplit[1]);
                    }
                    if(nLinha == 3){
                        CatarGolsXSenegal.setText(linhaSplit[0]);
                        SenegalGolsXCatar.setText(linhaSplit[1]);
                    }
                    if(nLinha == 4){
                        HolandaGolsXEquador.setText(linhaSplit[0]);
                        EquadorGolsXHolanda.setText(linhaSplit[1]);
                    }
                    if(nLinha == 5){
                        EquadorGolsXSenegal.setText(linhaSplit[0]);
                        SenegalGolsXEquador.setText(linhaSplit[1]);
                    }
                    if(nLinha == 6){
                        HolandaGolsXCatar.setText(linhaSplit[0]);
                        CatarGolsXHolanda.setText(linhaSplit[1]);
                    }
                    //Grupo B
                    if(nLinha == 7){
                        InglaterraGolsXIra.setText(linhaSplit[0]);
                        IraGolsXInglaterra.setText(linhaSplit[1]);
                    }
                    if(nLinha == 8){
                        GalesGolsXEstadosUnidos.setText(linhaSplit[0]);
                        EstadosUnidosGolsXGales.setText(linhaSplit[1]);
                    }
                    if(nLinha == 9){
                        GalesGolsXIra.setText(linhaSplit[0]);
                        IraGolsXGales.setText(linhaSplit[1]);
                    }
                    if(nLinha == 10){
                        InglaterraGolsXEstadosUnidos.setText(linhaSplit[0]);
                        EstadosUnidosGolsXInglaterra.setText(linhaSplit[1]);
                    }
                    if(nLinha ==11){
                        IraGolsXEstadosUnidos.setText(linhaSplit[0]);
                        EstadosUnidosGolsXIra.setText(linhaSplit[1]);
                    }
                    if(nLinha ==12){
                        GalesGolsXInglaterra.setText(linhaSplit[0]);
                        InglaterraGolsXGales.setText(linhaSplit[1]);
                    }
                    //Grupo C
                    if(nLinha ==13){
                        ArgentinaGolsXArabia.setText(linhaSplit[0]);
                        ArabiaGolsXArgentina.setText(linhaSplit[1]);
                    }
                    if(nLinha ==14){
                        MexicoGolsXPolonia.setText(linhaSplit[0]);
                        PoloniaGolsXMexico.setText(linhaSplit[1]);
                    }
                    if(nLinha ==15){
                        PoloniaGolsXArabia.setText(linhaSplit[0]);
                        ArabiaGolsXPolonia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==16){
                        ArgentinaGolsXMexico.setText(linhaSplit[0]);
                        MexicoGolsXArgentina.setText(linhaSplit[1]);
                    }
                    if(nLinha ==17){
                        PoloniaGolsXArgentina.setText(linhaSplit[0]);
                        ArgentinaGolsXPolonia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==18){
                        ArabiaGolsXMexico.setText(linhaSplit[0]);
                        MexicoGolsXArabia.setText(linhaSplit[1]);
                    }
                    //Grupo D
                    if(nLinha ==19){
                        DinamarcaGolsXTunisia.setText(linhaSplit[0]);
                        TunisiaGolsXDinamarca.setText(linhaSplit[1]);
                    }
                    if(nLinha ==20){
                        FrancaGolsXAustralia.setText(linhaSplit[0]);
                        AustraliaGolsXFranca.setText(linhaSplit[1]);
                    }
                    if(nLinha ==21){
                        TunisiaGolsXAustralia.setText(linhaSplit[0]);
                        AustraliaGolsXTunisia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==22){
                        FrancaGolsXDinamarca.setText(linhaSplit[0]);
                        DinamarcaGolsXFranca.setText(linhaSplit[1]);
                    }
                    if(nLinha ==23){
                        TunisiaGolsXFranca.setText(linhaSplit[0]);
                        FrancaGolsXTunisia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==24){
                        AustraliaGolsXDinamarca.setText(linhaSplit[0]);
                        DinamarcaGolsXAustralia.setText(linhaSplit[1]);
                    }
                    //Grupo E
                    if(nLinha ==25){
                        AlemanhaGolsXJapao.setText(linhaSplit[0]);
                        JapaoGolsXAlemanha.setText(linhaSplit[1]);
                    }
                    if(nLinha ==26){
                        EspanhaGolsXCostaRica.setText(linhaSplit[0]);
                        CostaRicaGolsXEspanha.setText(linhaSplit[1]);
                    }
                    if(nLinha ==27){
                        JapaoGolsXCostaRica.setText(linhaSplit[0]);
                        CostaRicaGolsXJapao.setText(linhaSplit[1]);
                    }
                    if(nLinha ==28){
                        EspanhaGolsXAlemanha.setText(linhaSplit[0]);
                        AlemanhaGolsXEspanha.setText(linhaSplit[1]);
                    }
                    if(nLinha ==29){
                        JapaoGolsXEspanha.setText(linhaSplit[0]);
                        EspanhaGolsXJapao.setText(linhaSplit[1]);
                    }
                    if(nLinha ==30){
                        CostaRicaGolsXAlemanha.setText(linhaSplit[0]);
                        AlemanhaGolsXCostaRica.setText(linhaSplit[1]);
                    }
                    //Grupo F
                    if(nLinha ==31){
                        MarrocosGolsXCroacia.setText(linhaSplit[0]);
                        CroaciaGolsXMarrocos.setText(linhaSplit[1]);
                    }
                    if(nLinha ==32){
                        BelgicaGolsXCanada.setText(linhaSplit[0]);
                        CanadaGolsXBelgica.setText(linhaSplit[1]);
                    }
                    if(nLinha ==33){
                        BelgicaGolsXMarrocos.setText(linhaSplit[0]);
                        MarrocosGolsXBelgica.setText(linhaSplit[1]);
                    }
                    if(nLinha ==34){
                        CroaciaGolsXCanada.setText(linhaSplit[0]);
                        CanadaGolsXCroacia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==35){
                        CanadaGolsXMarrocos.setText(linhaSplit[0]);
                        MarrocosGolsXCanada.setText(linhaSplit[1]);
                    }
                    if(nLinha ==36){
                        CroaciaGolsXBelgica.setText(linhaSplit[0]);
                        BelgicaGolsXCroacia.setText(linhaSplit[1]);
                    }
                    //Grupo G
                    if(nLinha ==37){
                        SuicaGolsXCamaroes.setText(linhaSplit[0]);
                        CamaroesGolsXSuica.setText(linhaSplit[1]);
                    }
                    if(nLinha ==38){
                        BrasilGolsXServia.setText(linhaSplit[0]);
                        SerrviaGolsXBrasil.setText(linhaSplit[1]);
                    }
                    if(nLinha ==39){
                        CamaroesGolsXServia.setText(linhaSplit[0]);
                        ServiaGolsXCamaroes.setText(linhaSplit[1]);
                    }
                    if(nLinha ==40){
                        BrasilGolsXSuica.setText(linhaSplit[0]);
                        SuicaGolsXBrasil.setText(linhaSplit[1]);
                    }
                    if(nLinha ==41){
                        ServiaGolsXSuica.setText(linhaSplit[0]);
                        SuicaGolsXServia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==42){
                        CamaroesGolsXBrasil.setText(linhaSplit[0]);
                        BrasilGolsXCamaroes.setText(linhaSplit[1]);
                    }
                    //Grupo H
                    if(nLinha ==43){
                        UruguaiGolsXCoreia.setText(linhaSplit[0]);
                        CoreiaGolsXUruguai.setText(linhaSplit[1]);
                    }
                    if(nLinha ==44){
                        PortugalGolsXGana.setText(linhaSplit[0]);
                        GanaGolsXPortugal.setText(linhaSplit[1]);
                    }
                    if(nLinha ==45){
                        CoreiaGolsXGana.setText(linhaSplit[0]);
                        GanaGolsXCoreia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==46){
                        PortugalGolsXUruguai.setText(linhaSplit[0]);
                        UruguaiGolsXPortugal.setText(linhaSplit[1]);
                    }
                    if(nLinha ==47){
                        CoreiaGolsXPortual.setText(linhaSplit[0]);
                        PortugalGolsXCoreia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==48){
                        GanaGolsXUruguai.setText(linhaSplit[0]);
                        UruguaiGolsXGana.setText(linhaSplit[1]);
                    }
                    //Oitavas
                    if(nLinha ==49){
                        Gols1Oitavas1.setText(linhaSplit[0]);
                        Gols2Oitavas1.setText(linhaSplit[1]);
                        Penaltis1Oitavas1.setText(linhaSplit[2]);
                        Penaltis2Oitavas1.setText(linhaSplit[3]);
                    }
                    if(nLinha ==50){
                        Gols1Oitavas2.setText(linhaSplit[0]);
                        Gols2Oitavas2.setText(linhaSplit[1]);
                        Penaltis1Oitavas2.setText(linhaSplit[2]);
                        Penaltis2Oitavas2.setText(linhaSplit[3]);

                    }
                    if(nLinha ==51){
                        Gols1Oitavas3.setText(linhaSplit[0]);
                        Gols2Oitavas3.setText(linhaSplit[1]);
                        Penaltis1Oitavas3.setText(linhaSplit[2]);
                        Penaltis2Oitavas3.setText(linhaSplit[3]);
                    }
                    if(nLinha ==52){
                        Gols1Oitavas4.setText(linhaSplit[0]);
                        Gols2Oitavas4.setText(linhaSplit[1]);
                        Penaltis1Oitavas4.setText(linhaSplit[2]);
                        Penaltis2Oitavas4.setText(linhaSplit[3]);
                    }
                    if(nLinha ==53){
                        Gols1Oitavas5.setText(linhaSplit[0]);
                        Gols2Oitavas5.setText(linhaSplit[1]);
                        Penaltis1Oitavas5.setText(linhaSplit[2]);
                        Penaltis2Oitavas5.setText(linhaSplit[3]);
                    }
                    if(nLinha ==54){
                        Gols1Oitavas6.setText(linhaSplit[0]);
                        Gols2Oitavas6.setText(linhaSplit[1]);
                        Penaltis1Oitavas6.setText(linhaSplit[2]);
                        Penaltis2Oitavas6.setText(linhaSplit[3]);

                    }
                    if(nLinha ==55){
                        Gols1Oitavas7.setText(linhaSplit[0]);
                        Gols2Oitavas7.setText(linhaSplit[1]);
                        Penaltis1Oitavas7.setText(linhaSplit[2]);
                        Penaltis2Oitavas7.setText(linhaSplit[3]);
                    }
                    if(nLinha ==56){
                        Gols1Oitavas8.setText(linhaSplit[0]);
                        Gols2Oitavas8.setText(linhaSplit[1]);
                        Penaltis1Oitavas8.setText(linhaSplit[2]);
                        Penaltis2Oitavas8.setText(linhaSplit[3]);
                    }
                    //Quartas
                    if(nLinha ==57){
                        Gols1Quartas1.setText(linhaSplit[0]);
                        Gols2Quartas1.setText(linhaSplit[1]);
                        Penaltis1Quartas1.setText(linhaSplit[2]);
                        Penaltis2Quartas1.setText(linhaSplit[3]);
                    }
                    if(nLinha ==58){
                        Gols1Quartas2.setText(linhaSplit[0]);
                        Gols2Quartas2.setText(linhaSplit[1]);
                        Penaltis1Quartas2.setText(linhaSplit[2]);
                        Penaltis2Quartas2.setText(linhaSplit[3]);
                    }
                    if(nLinha ==59){
                        Gols1Quartas3.setText(linhaSplit[0]);
                        Gols2Quartas3.setText(linhaSplit[1]);
                        Penaltis1Quartas3.setText(linhaSplit[2]);
                        Penaltis2Quartas3.setText(linhaSplit[3]);
                    }
                    if(nLinha ==60){
                        Gols1Quartas4.setText(linhaSplit[0]);
                        Gols2Quartas4.setText(linhaSplit[1]);
                        Penaltis1Quartas4.setText(linhaSplit[2]);
                        Penaltis2Quartas4.setText(linhaSplit[3]);
                    }
                    //Semis
                    if(nLinha ==61){
                        Gols1Semi1.setText(linhaSplit[0]);
                        Gols2Semi1.setText(linhaSplit[1]);
                        Penaltis1Semi1.setText(linhaSplit[2]);
                        Penaltis2Semi1.setText(linhaSplit[3]);
                    }
                    if(nLinha ==62){
                        Gols1Semi2.setText(linhaSplit[0]);
                        Gols2Semi2.setText(linhaSplit[1]);
                        Penaltis1Semi2.setText(linhaSplit[2]);
                        Penaltis2Semi2.setText(linhaSplit[3]);
                    }
                    //Final e Terceiro
                    if(nLinha ==63){
                        Gols1Final.setText(linhaSplit[0]);
                        Gols2Final.setText(linhaSplit[1]);
                        Penaltis1Final.setText(linhaSplit[2]);
                        Penaltis2Final.setText(linhaSplit[3]);
                    }
                    if(nLinha ==64){
                        Gols1Terceiro.setText(linhaSplit[0]);
                        Gols2Terceiro.setText(linhaSplit[1]);
                        Penaltis1Terceiro.setText(linhaSplit[2]);
                        Penaltis2Terceiro.setText(linhaSplit[3]);
                    }
                }

                for(int nl = 1; nl <= 34; nl++){
                    String linha1 = sc.nextLine();
                    if(nl == 1){
                        A1.setText(linha1);
                    }
                    if(nl == 2){
                        B2.setText(linha1);
                    }
                    if(nl == 3){
                        C1.setText(linha1);
                    }
                    if(nl == 4){
                        D2.setText(linha1);
                    }
                    if(nl == 5){
                        E1.setText(linha1);
                    }
                    if(nl == 6){
                        F2.setText(linha1);
                    }
                    if(nl == 7){
                        G1.setText(linha1);
                    }
                    if(nl == 8){
                        H2.setText(linha1);
                    }
                    if(nl == 9){
                        B1.setText(linha1);
                    }
                    if(nl == 10){
                        A2.setText(linha1);
                    }
                    if(nl == 11){
                        D1.setText(linha1);
                    }
                    if(nl == 12){
                        C2.setText(linha1);
                    }
                    if(nl == 13){
                        F1.setText(linha1);
                    }
                    if(nl == 14){
                        E2.setText(linha1);
                    }
                    if(nl == 15){
                        H1.setText(linha1);
                    }
                    if(nl == 16){
                        G2.setText(linha1);
                    }
                    if(nl == 17){
                        VencedorOitavas1.setText(linha1);
                    }
                    if(nl == 18){
                        VencedorOitavas2.setText(linha1);
                    }
                    if(nl == 19){
                        VencedorOitavas3.setText(linha1);
                    }
                    if(nl == 20){
                        VencedorOitavas4.setText(linha1);
                    }
                    if(nl == 21){
                        VencedorOitavas5.setText(linha1);
                    }
                    if(nl == 22){
                        VencedorOitavas6.setText(linha1);
                    }
                    if(nl == 23){
                        VencedorOitavas7.setText(linha1);
                    }
                    if(nl == 24){
                        VencedorOitavas8.setText(linha1);
                    }
                    if(nl == 25){
                        VencedorQuartas1.setText(linha1);
                    }
                    if(nl == 26){
                        VencedorQuartas2.setText(linha1);
                    }
                    if(nl == 27){
                        VencedorQuartas3.setText(linha1);
                    }
                    if(nl == 28){
                        VencedorQuartas4.setText(linha1);
                    }
                    if(nl == 29){
                        VencedorSemi1.setText(linha1);
                    }
                    if(nl == 30){
                        VencedorSemi2.setText(linha1);
                    }
                    if(nl == 31){
                        PerderdorSemi1.setText(linha1);
                    }
                    if(nl == 32){
                        PerderdorSemi2.setText(linha1);
                    }
                    if(nl == 33){
                        VencedorFinal.setText(linha1);
                    }
                    if(nl == 34){
                        VencedorTerceiro.setText(linha1);
                    }

                }

                for(int nTabela = 1; nTabela <= 32; nTabela++){

                    String linha = sc.nextLine();
                    String linhaSplit [] = linha.split(";");

                    if(nTabela == 1){

                        try {

                            Time1GrupoA.setText(linhaSplit[0]);
                            V1A.setText(linhaSplit[1]);
                            E1A.setText(linhaSplit[2]);
                            D1A.setText(linhaSplit[3]);
                            GP1A.setText(linhaSplit[4]);
                            GC1A.setText(linhaSplit[5]);
                            SG1A.setText(linhaSplit[6]);
                            PTS1A.setText(linhaSplit[7]);
                            C1A.setText(linhaSplit[8]);
                            Time1GrupoA.setIcon(new ImageIcon(linhaSplit[8]));

                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoA.setText(linhaSplit[0]);
                            V1A.setText(linhaSplit[1]);
                            E1A.setText(linhaSplit[2]);
                            D1A.setText(linhaSplit[3]);
                            GP1A.setText(linhaSplit[4]);
                            GC1A.setText(linhaSplit[5]);
                            SG1A.setText(linhaSplit[6]);
                            PTS1A.setText(linhaSplit[7]);
                            C1A.setText("");
                            Time1GrupoA.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 2){

                        try {

                            Time2GrupoA.setText(linhaSplit[0]);
                            V2A.setText(linhaSplit[1]);
                            E2A.setText(linhaSplit[2]);
                            D2A.setText(linhaSplit[3]);
                            GP2A.setText(linhaSplit[4]);
                            GC2A.setText(linhaSplit[5]);
                            SG2A.setText(linhaSplit[6]);
                            PTS2A.setText(linhaSplit[7]);
                            C2A.setText(linhaSplit[8]);
                            Time2GrupoA.setIcon(new ImageIcon(linhaSplit[8]));

                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoA.setText(linhaSplit[0]);
                            V2A.setText(linhaSplit[1]);
                            E2A.setText(linhaSplit[2]);
                            D2A.setText(linhaSplit[3]);
                            GP2A.setText(linhaSplit[4]);
                            GC2A.setText(linhaSplit[5]);
                            SG2A.setText(linhaSplit[6]);
                            PTS2A.setText(linhaSplit[7]);
                            C2A.setText("");
                            Time2GrupoA.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 3){

                        try {

                            Time3GrupoA.setText(linhaSplit[0]);
                            V3A.setText(linhaSplit[1]);
                            E3A.setText(linhaSplit[2]);
                            D3A.setText(linhaSplit[3]);
                            GP3A.setText(linhaSplit[4]);
                            GC3A.setText(linhaSplit[5]);
                            SG3A.setText(linhaSplit[6]);
                            PTS3A.setText(linhaSplit[7]);
                            C3A.setText(linhaSplit[8]);
                            Time3GrupoA.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch(ArrayIndexOutOfBoundsException exception){

                            Time3GrupoA.setText(linhaSplit[0]);
                            V3A.setText(linhaSplit[1]);
                            E3A.setText(linhaSplit[2]);
                            D3A.setText(linhaSplit[3]);
                            GP3A.setText(linhaSplit[4]);
                            GC3A.setText(linhaSplit[5]);
                            SG3A.setText(linhaSplit[6]);
                            PTS3A.setText(linhaSplit[7]);
                            C3A.setText("");
                            Time3GrupoA.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 4){

                        try {

                            Time4GrupoA.setText(linhaSplit[0]);
                            V4A.setText(linhaSplit[1]);
                            E4A.setText(linhaSplit[2]);
                            D4A.setText(linhaSplit[3]);
                            GP4A.setText(linhaSplit[4]);
                            GC4A.setText(linhaSplit[5]);
                            SG4A.setText(linhaSplit[6]);
                            PTS4A.setText(linhaSplit[7]);
                            C4A.setText(linhaSplit[8]);
                            Time4GrupoA.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoA.setText(linhaSplit[0]);
                            V4A.setText(linhaSplit[1]);
                            E4A.setText(linhaSplit[2]);
                            D4A.setText(linhaSplit[3]);
                            GP4A.setText(linhaSplit[4]);
                            GC4A.setText(linhaSplit[5]);
                            SG4A.setText(linhaSplit[6]);
                            PTS4A.setText(linhaSplit[7]);
                            C4A.setText("");
                            Time4GrupoA.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 5){

                        try {

                            Time1GrupoB.setText(linhaSplit[0]);
                            V1B.setText(linhaSplit[1]);
                            E1B.setText(linhaSplit[2]);
                            D1B.setText(linhaSplit[3]);
                            GP1B.setText(linhaSplit[4]);
                            GC1B.setText(linhaSplit[5]);
                            SG1B.setText(linhaSplit[6]);
                            PTS1B.setText(linhaSplit[7]);
                            C1B.setText(linhaSplit[8]);
                            Time1GrupoB.setIcon(new ImageIcon(linhaSplit[8]));

                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoB.setText(linhaSplit[0]);
                            V1B.setText(linhaSplit[1]);
                            E1B.setText(linhaSplit[2]);
                            D1B.setText(linhaSplit[3]);
                            GP1B.setText(linhaSplit[4]);
                            GC1B.setText(linhaSplit[5]);
                            SG1B.setText(linhaSplit[6]);
                            PTS1B.setText(linhaSplit[7]);
                            C1B.setText("");
                            Time1GrupoB.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 6){

                        try {

                            Time2GrupoB.setText(linhaSplit[0]);
                            V2B.setText(linhaSplit[1]);
                            E2B.setText(linhaSplit[2]);
                            D2B.setText(linhaSplit[3]);
                            GP2B.setText(linhaSplit[4]);
                            GC2B.setText(linhaSplit[5]);
                            SG2B.setText(linhaSplit[6]);
                            PTS2B.setText(linhaSplit[7]);
                            C2B.setText(linhaSplit[8]);
                            Time2GrupoB.setIcon(new ImageIcon(linhaSplit[8]));

                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoB.setText(linhaSplit[0]);
                            V2B.setText(linhaSplit[1]);
                            E2B.setText(linhaSplit[2]);
                            D2B.setText(linhaSplit[3]);
                            GP2B.setText(linhaSplit[4]);
                            GC2B.setText(linhaSplit[5]);
                            SG2B.setText(linhaSplit[6]);
                            PTS2B.setText(linhaSplit[7]);
                            C2B.setText("");
                            Time2GrupoB.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 7){

                        try {
                            Time3GrupoB.setText(linhaSplit[0]);
                            V3B.setText(linhaSplit[1]);
                            E3B.setText(linhaSplit[2]);
                            D3B.setText(linhaSplit[3]);
                            GP3B.setText(linhaSplit[4]);
                            GC3B.setText(linhaSplit[5]);
                            SG3B.setText(linhaSplit[6]);
                            PTS3B.setText(linhaSplit[7]);
                            C3B.setText(linhaSplit[8]);
                            Time3GrupoB.setIcon(new ImageIcon(linhaSplit[8]));

                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time3GrupoB.setText(linhaSplit[0]);
                            V3B.setText(linhaSplit[1]);
                            E3B.setText(linhaSplit[2]);
                            D3B.setText(linhaSplit[3]);
                            GP3B.setText(linhaSplit[4]);
                            GC3B.setText(linhaSplit[5]);
                            SG3B.setText(linhaSplit[6]);
                            PTS3B.setText(linhaSplit[7]);
                            C3B.setText("");
                            Time3GrupoB.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 8){
                        try {
                            Time4GrupoB.setText(linhaSplit[0]);
                            V4B.setText(linhaSplit[1]);
                            E4B.setText(linhaSplit[2]);
                            D4B.setText(linhaSplit[3]);
                            GP4B.setText(linhaSplit[4]);
                            GC4B.setText(linhaSplit[5]);
                            SG4B.setText(linhaSplit[6]);
                            PTS4B.setText(linhaSplit[7]);
                            C4B.setText(linhaSplit[8]);
                            Time4GrupoB.setIcon(new ImageIcon(linhaSplit[8]));

                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoB.setText(linhaSplit[0]);
                            V4B.setText(linhaSplit[1]);
                            E4B.setText(linhaSplit[2]);
                            D4B.setText(linhaSplit[3]);
                            GP4B.setText(linhaSplit[4]);
                            GC4B.setText(linhaSplit[5]);
                            SG4B.setText(linhaSplit[6]);
                            PTS4B.setText(linhaSplit[7]);
                            C4B.setText("");
                            Time4GrupoB.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 9){

                        try {
                            Time1GrupoC.setText(linhaSplit[0]);
                            V1C.setText(linhaSplit[1]);
                            E1C.setText(linhaSplit[2]);
                            D1C.setText(linhaSplit[3]);
                            GP1C.setText(linhaSplit[4]);
                            GC1C.setText(linhaSplit[5]);
                            SG1C.setText(linhaSplit[6]);
                            PTS1C.setText(linhaSplit[7]);
                            C1C.setText(linhaSplit[8]);
                            Time1GrupoC.setIcon(new ImageIcon(linhaSplit[8]));

                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoC.setText(linhaSplit[0]);
                            V1C.setText(linhaSplit[1]);
                            E1C.setText(linhaSplit[2]);
                            D1C.setText(linhaSplit[3]);
                            GP1C.setText(linhaSplit[4]);
                            GC1C.setText(linhaSplit[5]);
                            SG1C.setText(linhaSplit[6]);
                            PTS1C.setText(linhaSplit[7]);
                            C1C.setText("");
                            Time1GrupoC.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 10){

                        try {
                            Time2GrupoC.setText(linhaSplit[0]);
                            V2C.setText(linhaSplit[1]);
                            E2C.setText(linhaSplit[2]);
                            D2C.setText(linhaSplit[3]);
                            GP2C.setText(linhaSplit[4]);
                            GC2C.setText(linhaSplit[5]);
                            SG2C.setText(linhaSplit[6]);
                            PTS2C.setText(linhaSplit[7]);
                            C2C.setText(linhaSplit[8]);
                            Time2GrupoC.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoC.setText(linhaSplit[0]);
                            V2C.setText(linhaSplit[1]);
                            E2C.setText(linhaSplit[2]);
                            D2C.setText(linhaSplit[3]);
                            GP2C.setText(linhaSplit[4]);
                            GC2C.setText(linhaSplit[5]);
                            SG2C.setText(linhaSplit[6]);
                            PTS2C.setText(linhaSplit[7]);
                            C2C.setText("");
                            Time2GrupoC.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 11){

                        try {
                            Time3GrupoC.setText(linhaSplit[0]);
                            V3C.setText(linhaSplit[1]);
                            E3C.setText(linhaSplit[2]);
                            D3C.setText(linhaSplit[3]);
                            GP3C.setText(linhaSplit[4]);
                            GC3C.setText(linhaSplit[5]);
                            SG3C.setText(linhaSplit[6]);
                            PTS3C.setText(linhaSplit[7]);
                            C3C.setText(linhaSplit[8]);
                            Time3GrupoC.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time3GrupoC.setText(linhaSplit[0]);
                            V3C.setText(linhaSplit[1]);
                            E3C.setText(linhaSplit[2]);
                            D3C.setText(linhaSplit[3]);
                            GP3C.setText(linhaSplit[4]);
                            GC3C.setText(linhaSplit[5]);
                            SG3C.setText(linhaSplit[6]);
                            PTS3C.setText(linhaSplit[7]);
                            C3C.setText("");
                            Time3GrupoC.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 12){

                        try {
                            Time4GrupoC.setText(linhaSplit[0]);
                            V4C.setText(linhaSplit[1]);
                            E4C.setText(linhaSplit[2]);
                            D4C.setText(linhaSplit[3]);
                            GP4C.setText(linhaSplit[4]);
                            GC4C.setText(linhaSplit[5]);
                            SG4C.setText(linhaSplit[6]);
                            PTS4C.setText(linhaSplit[7]);
                            C4C.setText(linhaSplit[8]);
                            Time4GrupoC.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoC.setText(linhaSplit[0]);
                            V4C.setText(linhaSplit[1]);
                            E4C.setText(linhaSplit[2]);
                            D4C.setText(linhaSplit[3]);
                            GP4C.setText(linhaSplit[4]);
                            GC4C.setText(linhaSplit[5]);
                            SG4C.setText(linhaSplit[6]);
                            PTS4C.setText(linhaSplit[7]);
                            C4C.setText("");
                            Time4GrupoC.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 13){

                        try {
                            Time1GrupoD.setText(linhaSplit[0]);
                            V1D.setText(linhaSplit[1]);
                            E1D.setText(linhaSplit[2]);
                            D1D.setText(linhaSplit[3]);
                            GP1D.setText(linhaSplit[4]);
                            GC1D.setText(linhaSplit[5]);
                            SG1D.setText(linhaSplit[6]);
                            PTS1D.setText(linhaSplit[7]);
                            C1D.setText(linhaSplit[8]);
                            Time1GrupoD.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoD.setText(linhaSplit[0]);
                            V1D.setText(linhaSplit[1]);
                            E1D.setText(linhaSplit[2]);
                            D1D.setText(linhaSplit[3]);
                            GP1D.setText(linhaSplit[4]);
                            GC1D.setText(linhaSplit[5]);
                            SG1D.setText(linhaSplit[6]);
                            PTS1D.setText(linhaSplit[7]);
                            C1D.setText("");
                            Time1GrupoD.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 14){

                        try {
                            Time2GrupoD.setText(linhaSplit[0]);
                            V2D.setText(linhaSplit[1]);
                            E2D.setText(linhaSplit[2]);
                            D2D.setText(linhaSplit[3]);
                            GP2D.setText(linhaSplit[4]);
                            GC2D.setText(linhaSplit[5]);
                            SG2D.setText(linhaSplit[6]);
                            PTS2D.setText(linhaSplit[7]);
                            C2D.setText(linhaSplit[8]);
                            Time2GrupoD.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoD.setText(linhaSplit[0]);
                            V2D.setText(linhaSplit[1]);
                            E2D.setText(linhaSplit[2]);
                            D2D.setText(linhaSplit[3]);
                            GP2D.setText(linhaSplit[4]);
                            GC2D.setText(linhaSplit[5]);
                            SG2D.setText(linhaSplit[6]);
                            PTS2D.setText(linhaSplit[7]);
                            C2D.setText("");
                            Time2GrupoD.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 15){

                        try {
                            Time3GrupoD.setText(linhaSplit[0]);
                            V3D.setText(linhaSplit[1]);
                            E3D.setText(linhaSplit[2]);
                            D3D.setText(linhaSplit[3]);
                            GP3D.setText(linhaSplit[4]);
                            GC3D.setText(linhaSplit[5]);
                            SG3D.setText(linhaSplit[6]);
                            PTS3D.setText(linhaSplit[7]);
                            C3D.setText(linhaSplit[8]);
                            Time3GrupoD.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time3GrupoD.setText(linhaSplit[0]);
                            V3D.setText(linhaSplit[1]);
                            E3D.setText(linhaSplit[2]);
                            D3D.setText(linhaSplit[3]);
                            GP3D.setText(linhaSplit[4]);
                            GC3D.setText(linhaSplit[5]);
                            SG3D.setText(linhaSplit[6]);
                            PTS3D.setText(linhaSplit[7]);
                            C3D.setText("");
                            Time3GrupoD.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 16){

                        try {
                            Time4GrupoD.setText(linhaSplit[0]);
                            V4D.setText(linhaSplit[1]);
                            E4D.setText(linhaSplit[2]);
                            D4D.setText(linhaSplit[3]);
                            GP4D.setText(linhaSplit[4]);
                            GC4D.setText(linhaSplit[5]);
                            SG4D.setText(linhaSplit[6]);
                            PTS4D.setText(linhaSplit[7]);
                            C4D.setText(linhaSplit[8]);
                            Time4GrupoD.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoD.setText(linhaSplit[0]);
                            V4D.setText(linhaSplit[1]);
                            E4D.setText(linhaSplit[2]);
                            D4D.setText(linhaSplit[3]);
                            GP4D.setText(linhaSplit[4]);
                            GC4D.setText(linhaSplit[5]);
                            SG4D.setText(linhaSplit[6]);
                            PTS4D.setText(linhaSplit[7]);
                            C4D.setText("");
                            Time4GrupoD.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 17){

                        try {
                            Time1GrupoE.setText(linhaSplit[0]);
                            V1E.setText(linhaSplit[1]);
                            E1E.setText(linhaSplit[2]);
                            D1E.setText(linhaSplit[3]);
                            GP1E.setText(linhaSplit[4]);
                            GC1E.setText(linhaSplit[5]);
                            SG1E.setText(linhaSplit[6]);
                            PTS1E.setText(linhaSplit[7]);
                            C1E.setText(linhaSplit[8]);
                            Time1GrupoE.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoE.setText(linhaSplit[0]);
                            V1E.setText(linhaSplit[1]);
                            E1E.setText(linhaSplit[2]);
                            D1E.setText(linhaSplit[3]);
                            GP1E.setText(linhaSplit[4]);
                            GC1E.setText(linhaSplit[5]);
                            SG1E.setText(linhaSplit[6]);
                            PTS1E.setText(linhaSplit[7]);
                            C1E.setText("");
                            Time1GrupoE.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 18){

                        try {
                            Time2GrupoE.setText(linhaSplit[0]);
                            V2E.setText(linhaSplit[1]);
                            E2E.setText(linhaSplit[2]);
                            D2E.setText(linhaSplit[3]);
                            GP2E.setText(linhaSplit[4]);
                            GC2E.setText(linhaSplit[5]);
                            SG2E.setText(linhaSplit[6]);
                            PTS2E.setText(linhaSplit[7]);
                            C2E.setText(linhaSplit[8]);
                            Time2GrupoE.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoE.setText(linhaSplit[0]);
                            V2E.setText(linhaSplit[1]);
                            E2E.setText(linhaSplit[2]);
                            D2E.setText(linhaSplit[3]);
                            GP2E.setText(linhaSplit[4]);
                            GC2E.setText(linhaSplit[5]);
                            SG2E.setText(linhaSplit[6]);
                            PTS2E.setText(linhaSplit[7]);
                            C2E.setText("");
                            Time2GrupoE.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 19){

                        try {
                            Time3GrupoE.setText(linhaSplit[0]);
                            V3E.setText(linhaSplit[1]);
                            E3E.setText(linhaSplit[2]);
                            D3E.setText(linhaSplit[3]);
                            GP3E.setText(linhaSplit[4]);
                            GC3E.setText(linhaSplit[5]);
                            SG3E.setText(linhaSplit[6]);
                            PTS3E.setText(linhaSplit[7]);
                            C3E.setText(linhaSplit[8]);
                            Time3GrupoE.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time3GrupoE.setText(linhaSplit[0]);
                            V3E.setText(linhaSplit[1]);
                            E3E.setText(linhaSplit[2]);
                            D3E.setText(linhaSplit[3]);
                            GP3E.setText(linhaSplit[4]);
                            GC3E.setText(linhaSplit[5]);
                            SG3E.setText(linhaSplit[6]);
                            PTS3E.setText(linhaSplit[7]);
                            C3E.setText("");
                            Time3GrupoE.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 20){

                        try {
                            Time4GrupoE.setText(linhaSplit[0]);
                            V4E.setText(linhaSplit[1]);
                            E4E.setText(linhaSplit[2]);
                            D4E.setText(linhaSplit[3]);
                            GP4E.setText(linhaSplit[4]);
                            GC4E.setText(linhaSplit[5]);
                            SG4E.setText(linhaSplit[6]);
                            PTS4E.setText(linhaSplit[7]);
                            C4E.setText(linhaSplit[8]);
                            Time4GrupoE.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoE.setText(linhaSplit[0]);
                            V4E.setText(linhaSplit[1]);
                            E4E.setText(linhaSplit[2]);
                            D4E.setText(linhaSplit[3]);
                            GP4E.setText(linhaSplit[4]);
                            GC4E.setText(linhaSplit[5]);
                            SG4E.setText(linhaSplit[6]);
                            PTS4E.setText(linhaSplit[7]);
                            C4E.setText("");
                            Time4GrupoE.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 21){

                        try {
                            Time1GrupoF.setText(linhaSplit[0]);
                            V1F.setText(linhaSplit[1]);
                            E1F.setText(linhaSplit[2]);
                            D1F.setText(linhaSplit[3]);
                            GP1F.setText(linhaSplit[4]);
                            GC1F.setText(linhaSplit[5]);
                            SG1F.setText(linhaSplit[6]);
                            PTS1F.setText(linhaSplit[7]);
                            C1F.setText(linhaSplit[8]);
                            Time1GrupoF.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoF.setText(linhaSplit[0]);
                            V1F.setText(linhaSplit[1]);
                            E1F.setText(linhaSplit[2]);
                            D1F.setText(linhaSplit[3]);
                            GP1F.setText(linhaSplit[4]);
                            GC1F.setText(linhaSplit[5]);
                            SG1F.setText(linhaSplit[6]);
                            PTS1F.setText(linhaSplit[7]);
                            C1F.setText("");
                            Time1GrupoF.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 22){

                        try {
                            Time2GrupoF.setText(linhaSplit[0]);
                            V2F.setText(linhaSplit[1]);
                            E2F.setText(linhaSplit[2]);
                            D2F.setText(linhaSplit[3]);
                            GP2F.setText(linhaSplit[4]);
                            GC2F.setText(linhaSplit[5]);
                            SG2F.setText(linhaSplit[6]);
                            PTS2F.setText(linhaSplit[7]);
                            C2F.setText(linhaSplit[8]);
                            Time2GrupoF.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoF.setText(linhaSplit[0]);
                            V2F.setText(linhaSplit[1]);
                            E2F.setText(linhaSplit[2]);
                            D2F.setText(linhaSplit[3]);
                            GP2F.setText(linhaSplit[4]);
                            GC2F.setText(linhaSplit[5]);
                            SG2F.setText(linhaSplit[6]);
                            PTS2F.setText(linhaSplit[7]);
                            C2F.setText("");
                            Time2GrupoF.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 23){

                        try {
                            Time3GrupoF.setText(linhaSplit[0]);
                            V3F.setText(linhaSplit[1]);
                            E3F.setText(linhaSplit[2]);
                            D3F.setText(linhaSplit[3]);
                            GP3F.setText(linhaSplit[4]);
                            GC3F.setText(linhaSplit[5]);
                            SG3F.setText(linhaSplit[6]);
                            PTS3F.setText(linhaSplit[7]);
                            C3F.setText(linhaSplit[8]);
                            Time3GrupoF.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time3GrupoF.setText(linhaSplit[0]);
                            V3F.setText(linhaSplit[1]);
                            E3F.setText(linhaSplit[2]);
                            D3F.setText(linhaSplit[3]);
                            GP3F.setText(linhaSplit[4]);
                            GC3F.setText(linhaSplit[5]);
                            SG3F.setText(linhaSplit[6]);
                            PTS3F.setText(linhaSplit[7]);
                            C3F.setText("");
                            Time3GrupoF.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 24){

                        try {
                            Time4GrupoF.setText(linhaSplit[0]);
                            V4F.setText(linhaSplit[1]);
                            E4F.setText(linhaSplit[2]);
                            D4F.setText(linhaSplit[3]);
                            GP4F.setText(linhaSplit[4]);
                            GC4F.setText(linhaSplit[5]);
                            SG4F.setText(linhaSplit[6]);
                            PTS4F.setText(linhaSplit[7]);
                            C4F.setText(linhaSplit[8]);
                            Time4GrupoF.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoF.setText(linhaSplit[0]);
                            V4F.setText(linhaSplit[1]);
                            E4F.setText(linhaSplit[2]);
                            D4F.setText(linhaSplit[3]);
                            GP4F.setText(linhaSplit[4]);
                            GC4F.setText(linhaSplit[5]);
                            SG4F.setText(linhaSplit[6]);
                            PTS4F.setText(linhaSplit[7]);
                            C4F.setText("");
                            Time4GrupoF.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 25){

                        try {
                            Time1GrupoG.setText(linhaSplit[0]);
                            V1G.setText(linhaSplit[1]);
                            E1G.setText(linhaSplit[2]);
                            D1G.setText(linhaSplit[3]);
                            GP1G.setText(linhaSplit[4]);
                            GC1G.setText(linhaSplit[5]);
                            SG1G.setText(linhaSplit[6]);
                            PTS1G.setText(linhaSplit[7]);
                            C1G.setText(linhaSplit[8]);
                            Time1GrupoG.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoG.setText(linhaSplit[0]);
                            V1G.setText(linhaSplit[1]);
                            E1G.setText(linhaSplit[2]);
                            D1G.setText(linhaSplit[3]);
                            GP1G.setText(linhaSplit[4]);
                            GC1G.setText(linhaSplit[5]);
                            SG1G.setText(linhaSplit[6]);
                            PTS1G.setText(linhaSplit[7]);
                            C1G.setText("");
                            Time1GrupoG.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 26){

                        try {
                            Time2GrupoG.setText(linhaSplit[0]);
                            V2G.setText(linhaSplit[1]);
                            E2G.setText(linhaSplit[2]);
                            D2G.setText(linhaSplit[3]);
                            GP2G.setText(linhaSplit[4]);
                            GC2G.setText(linhaSplit[5]);
                            SG2G.setText(linhaSplit[6]);
                            PTS2G.setText(linhaSplit[7]);
                            C2G.setText(linhaSplit[8]);
                            Time2GrupoG.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoG.setText(linhaSplit[0]);
                            V2G.setText(linhaSplit[1]);
                            E2G.setText(linhaSplit[2]);
                            D2G.setText(linhaSplit[3]);
                            GP2G.setText(linhaSplit[4]);
                            GC2G.setText(linhaSplit[5]);
                            SG2G.setText(linhaSplit[6]);
                            PTS2G.setText(linhaSplit[7]);
                            C2G.setText("");
                            Time2GrupoG.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 27){

                        try {
                            Time3GrupoG.setText(linhaSplit[0]);
                            V3G.setText(linhaSplit[1]);
                            E3G.setText(linhaSplit[2]);
                            D3G.setText(linhaSplit[3]);
                            GP3G.setText(linhaSplit[4]);
                            GC3G.setText(linhaSplit[5]);
                            SG3G.setText(linhaSplit[6]);
                            PTS3G.setText(linhaSplit[7]);
                            C3G.setText(linhaSplit[8]);
                            Time3GrupoG.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time3GrupoG.setText(linhaSplit[0]);
                            V3G.setText(linhaSplit[1]);
                            E3G.setText(linhaSplit[2]);
                            D3G.setText(linhaSplit[3]);
                            GP3G.setText(linhaSplit[4]);
                            GC3G.setText(linhaSplit[5]);
                            SG3G.setText(linhaSplit[6]);
                            PTS3G.setText(linhaSplit[7]);
                            C3G.setText("");
                            Time3GrupoG.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 28){

                        try {
                            Time4GrupoG.setText(linhaSplit[0]);
                            V4G.setText(linhaSplit[1]);
                            E4G.setText(linhaSplit[2]);
                            D4G.setText(linhaSplit[3]);
                            GP4G.setText(linhaSplit[4]);
                            GC4G.setText(linhaSplit[5]);
                            SG4G.setText(linhaSplit[6]);
                            PTS4G.setText(linhaSplit[7]);
                            C4G.setText(linhaSplit[8]);
                            Time4GrupoG.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoG.setText(linhaSplit[0]);
                            V4G.setText(linhaSplit[1]);
                            E4G.setText(linhaSplit[2]);
                            D4G.setText(linhaSplit[3]);
                            GP4G.setText(linhaSplit[4]);
                            GC4G.setText(linhaSplit[5]);
                            SG4G.setText(linhaSplit[6]);
                            PTS4G.setText(linhaSplit[7]);
                            C4G.setText("");
                            Time4GrupoG.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 29){

                        try {
                            Time1GrupoH.setText(linhaSplit[0]);
                            V1H.setText(linhaSplit[1]);
                            E1H.setText(linhaSplit[2]);
                            D1H.setText(linhaSplit[3]);
                            GP1H.setText(linhaSplit[4]);
                            GC1H.setText(linhaSplit[5]);
                            SG1H.setText(linhaSplit[6]);
                            PTS1H.setText(linhaSplit[7]);
                            C1H.setText(linhaSplit[8]);
                            Time1GrupoH.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time1GrupoH.setText(linhaSplit[0]);
                            V1H.setText(linhaSplit[1]);
                            E1H.setText(linhaSplit[2]);
                            D1H.setText(linhaSplit[3]);
                            GP1H.setText(linhaSplit[4]);
                            GC1H.setText(linhaSplit[5]);
                            SG1H.setText(linhaSplit[6]);
                            PTS1H.setText(linhaSplit[7]);
                            C1H.setText("");
                            Time1GrupoH.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 30){

                        try {
                            Time2GrupoH.setText(linhaSplit[0]);
                            V2H.setText(linhaSplit[1]);
                            E2H.setText(linhaSplit[2]);
                            D2H.setText(linhaSplit[3]);
                            GP2H.setText(linhaSplit[4]);
                            GC2H.setText(linhaSplit[5]);
                            SG2H.setText(linhaSplit[6]);
                            PTS2H.setText(linhaSplit[7]);
                            C2H.setText(linhaSplit[8]);
                            Time2GrupoH.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time2GrupoH.setText(linhaSplit[0]);
                            V2H.setText(linhaSplit[1]);
                            E2H.setText(linhaSplit[2]);
                            D2H.setText(linhaSplit[3]);
                            GP2H.setText(linhaSplit[4]);
                            GC2H.setText(linhaSplit[5]);
                            SG2H.setText(linhaSplit[6]);
                            PTS2H.setText(linhaSplit[7]);
                            C2H.setText("");
                            Time2GrupoH.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 31){

                        try {
                            Time3GrupoH.setText(linhaSplit[0]);
                            V3H.setText(linhaSplit[1]);
                            E3H.setText(linhaSplit[2]);
                            D3H.setText(linhaSplit[3]);
                            GP3H.setText(linhaSplit[4]);
                            GC3H.setText(linhaSplit[5]);
                            SG3H.setText(linhaSplit[6]);
                            PTS3H.setText(linhaSplit[7]);
                            C3H.setText(linhaSplit[8]);
                            Time3GrupoH.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time3GrupoH.setText(linhaSplit[0]);
                            V3H.setText(linhaSplit[1]);
                            E3H.setText(linhaSplit[2]);
                            D3H.setText(linhaSplit[3]);
                            GP3H.setText(linhaSplit[4]);
                            GC3H.setText(linhaSplit[5]);
                            SG3H.setText(linhaSplit[6]);
                            PTS3H.setText(linhaSplit[7]);
                            C3H.setText("");
                            Time3GrupoH.setIcon(new ImageIcon());

                        }

                    }

                    if(nTabela == 32){

                        try {
                            Time4GrupoH.setText(linhaSplit[0]);
                            V4H.setText(linhaSplit[1]);
                            E4H.setText(linhaSplit[2]);
                            D4H.setText(linhaSplit[3]);
                            GP4H.setText(linhaSplit[4]);
                            GC4H.setText(linhaSplit[5]);
                            SG4H.setText(linhaSplit[6]);
                            PTS4H.setText(linhaSplit[7]);
                            C4H.setText(linhaSplit[8]);
                            Time4GrupoH.setIcon(new ImageIcon(linhaSplit[8]));
                        }

                        catch (ArrayIndexOutOfBoundsException exception){

                            Time4GrupoH.setText(linhaSplit[0]);
                            V4H.setText(linhaSplit[1]);
                            E4H.setText(linhaSplit[2]);
                            D4H.setText(linhaSplit[3]);
                            GP4H.setText(linhaSplit[4]);
                            GC4H.setText(linhaSplit[5]);
                            SG4H.setText(linhaSplit[6]);
                            PTS4H.setText(linhaSplit[7]);
                            C4H.setText("");
                            Time4GrupoH.setIcon(new ImageIcon());

                        }

                    }

                }

            }
        }catch (IOException ex){

        }
    }

    public Tabela() {

        Icon catar = new ImageIcon(System.getProperty("user.dir") + "/icons/catar.png");

        Catar1.setIcon(catar);
        Catar2.setIcon(catar);
        Catar3.setIcon(catar);

        Icon equador = new ImageIcon(System.getProperty("user.dir") + "/icons/equador.png");

        Equador1.setIcon(equador);
        Equador2.setIcon(equador);
        Equador3.setIcon(equador);

        Icon senegal = new ImageIcon(System.getProperty("user.dir") + "/icons/senegal.png");

        Senegal1.setIcon(senegal);
        Senegal2.setIcon(senegal);
        Senegal3.setIcon(senegal);

        Icon holanda = new ImageIcon(System.getProperty("user.dir") + "/icons/holanda.png");

        Holanda1.setIcon(holanda);
        Holanda2.setIcon(holanda);
        Holanda3.setIcon(holanda);

        Icon inglaterra = new ImageIcon(System.getProperty("user.dir") + "/icons/inglaterra.png");

        Inglaterra1.setIcon(inglaterra);
        Inglaterra2.setIcon(inglaterra);
        Inglaterra3.setIcon(inglaterra);

        Icon ira = new ImageIcon(System.getProperty("user.dir") + "/icons/ira.png");

        Ira1.setIcon(ira);
        Ira2.setIcon(ira);
        Ira3.setIcon(ira);

        Icon gales = new ImageIcon(System.getProperty("user.dir") + "/icons/gales.png");

        Gales1.setIcon(gales);
        Gales2.setIcon(gales);
        Gales3.setIcon(gales);

        Icon usa = new ImageIcon(System.getProperty("user.dir") + "/icons/eua.png");

        Usa1.setIcon(usa);
        Usa2.setIcon(usa);
        Usa3.setIcon(usa);

        Icon argentina = new ImageIcon(System.getProperty("user.dir") + "/icons/argentina.png");

        Argentina1.setIcon(argentina);
        Argentina2.setIcon(argentina);
        Argentina3.setIcon(argentina);

        Icon arabia = new ImageIcon(System.getProperty("user.dir") + "/icons/arabia saudita.png");

        Arabia1.setIcon(arabia);
        Arabia2.setIcon(arabia);
        Arabia3.setIcon(arabia);

        Icon mexico = new ImageIcon(System.getProperty("user.dir") + "/icons/mexico.png");

        Mexico1.setIcon(mexico);
        Mexico2.setIcon(mexico);
        Mexico3.setIcon(mexico);

        Icon polonia = new ImageIcon(System.getProperty("user.dir") + "/icons/polonia.png");

        Polonia1.setIcon(polonia);
        Polonia2.setIcon(polonia);
        Polonia3.setIcon(polonia);

        Icon dinamarca = new ImageIcon(System.getProperty("user.dir") + "/icons/dinamarca.png");

        Dinamarca1.setIcon(dinamarca);
        Dinamarca2.setIcon(dinamarca);
        Dinamarca3.setIcon(dinamarca);

        Icon tunisia = new ImageIcon(System.getProperty("user.dir") + "/icons/tunisia.png");

        Tunisia1.setIcon(tunisia);
        Tunisia2.setIcon(tunisia);
        Tunisia3.setIcon(tunisia);

        Icon franca = new ImageIcon(System.getProperty("user.dir") + "/icons/franca.png");

        Franca1.setIcon(franca);
        Franca2.setIcon(franca);
        Franca3.setIcon(franca);

        Icon australia = new ImageIcon(System.getProperty("user.dir") + "/icons/australia.png");

        Australia1.setIcon(australia);
        Australia2.setIcon(australia);
        Australia3.setIcon(australia);

        Icon alemanha = new ImageIcon(System.getProperty("user.dir") + "/icons/alemanha.png");

        Alemanha1.setIcon(alemanha);
        Alemanha2.setIcon(alemanha);
        Alemanha3.setIcon(alemanha);

        Icon japao = new ImageIcon(System.getProperty("user.dir") + "/icons/japao.png");

        Japao1.setIcon(japao);
        Japao2.setIcon(japao);
        Japao3.setIcon(japao);

        Icon espanha = new ImageIcon(System.getProperty("user.dir") + "/icons/espanha.png");

        Espanha1.setIcon(espanha);
        Espanha2.setIcon(espanha);
        Espanha3.setIcon(espanha);

        Icon costa = new ImageIcon(System.getProperty("user.dir") + "/icons/costa rica.png");

        Costa1.setIcon(costa);
        Costa2.setIcon(costa);
        Costa3.setIcon(costa);

        Icon marrocos = new ImageIcon(System.getProperty("user.dir") + "/icons/marrocos.png");

        Marrocos1.setIcon(marrocos);
        Marrocos2.setIcon(marrocos);
        Marrocos3.setIcon(marrocos);

        Icon croacia = new ImageIcon(System.getProperty("user.dir") + "/icons/croacia.png");

        Croacia1.setIcon(croacia);
        Croacia2.setIcon(croacia);
        Croacia3.setIcon(croacia);

        Icon belgica = new ImageIcon(System.getProperty("user.dir") + "/icons/belgica.png");

        Belgica1.setIcon(belgica);
        Belgica2.setIcon(belgica);
        Belgica3.setIcon(belgica);

        Icon canada = new ImageIcon(System.getProperty("user.dir") + "/icons/canada.png");

        Canada1.setIcon(canada);
        Canada2.setIcon(canada);
        Canada3.setIcon(canada);

        Icon suica = new ImageIcon(System.getProperty("user.dir") + "/icons/suica.png");

        Suica1.setIcon(suica);
        Suica2.setIcon(suica);
        Suica3.setIcon(suica);

        Icon camaroes = new ImageIcon(System.getProperty("user.dir") + "/icons/camaroes.png");

        Camaroes1.setIcon(camaroes);
        Camaroes2.setIcon(camaroes);
        Camaroes3.setIcon(camaroes);

        Icon brasil = new ImageIcon(System.getProperty("user.dir") + "/icons/brasil.png");

        Brasil1.setIcon(brasil);
        Brasil2.setIcon(brasil);
        Brasil3.setIcon(brasil);

        Icon servia = new ImageIcon(System.getProperty("user.dir") + "/icons/servia.png");

        Servia1.setIcon(servia);
        Servia2.setIcon(servia);
        Servia3.setIcon(servia);

        Icon uruguai = new ImageIcon(System.getProperty("user.dir") + "/icons/uruguai.png");

        Uruguai1.setIcon(uruguai);
        Uruguai2.setIcon(uruguai);
        Uruguai3.setIcon(uruguai);

        Icon coreia = new ImageIcon(System.getProperty("user.dir") + "/icons/coreia do sul.png");

        Coreia1.setIcon(coreia);
        Coreia2.setIcon(coreia);
        Coreia3.setIcon(coreia);

        Icon portugal = new ImageIcon(System.getProperty("user.dir") + "/icons/portugal.png");

        Portugal1.setIcon(portugal);
        Portugal2.setIcon(portugal);
        Portugal3.setIcon(portugal);

        Icon gana = new ImageIcon(System.getProperty("user.dir") + "/icons/gana.png");

        Gana1.setIcon(gana);
        Gana2.setIcon(gana);
        Gana3.setIcon(gana);

        try {
            Ler();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Excessões Tratadas

        enviarBotaoGrupoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoA, Time2GrupoA, Time3GrupoA, Time4GrupoA};

                    JLabel[] vitorias = new JLabel[]{V1A, V2A, V3A, V4A};

                    JLabel[] empates = new JLabel[]{E1A, E2A, E3A, E4A};

                    JLabel[] derrotas = new JLabel[]{D1A, D2A, D3A, D4A};

                    JLabel[] golsPro = new JLabel[]{GP1A, GP2A, GP3A, GP4A};

                    JLabel[] golsCon = new JLabel[]{GC1A, GC2A, GC3A, GC4A};

                    JLabel[] saldoGols = new JLabel[]{SG1A, SG2A, SG3A, SG4A};

                    JLabel[] pontos = new JLabel[]{PTS1A, PTS2A, PTS3A, PTS4A};

                    JLabel[] caminhosBandeira = new JLabel[]{C1A, C2A, C3A, C4A};

                    ArrayList<Time> GrupoAArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoATexts.length; i++){

                        if(Integer.parseInt(GrupoATexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoAArrayList.add(GrupoATimes[i]);

                    }

                    for (int i = 0; i < GrupoAArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoAArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i).setGols1(Integer.parseInt(GrupoATexts[2 * i].getText()));

                        copa.getPartidas().get(i).getTime1().addGols(Integer.parseInt(GrupoATexts[2 * i].getText()));

                        copa.getPartidas().get(i).getTime2().addGolsSofridos(Integer.parseInt(GrupoATexts[2 * i].getText()));

                        copa.getPartidas().get(i).setGols2(Integer.parseInt(GrupoATexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i).getTime2().addGols(Integer.parseInt(GrupoATexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i).getTime1().addGolsSofridos(Integer.parseInt(GrupoATexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i).definePontos();

                        copa.getPartidas().get(i).defineVDE();

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoAArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoATimes[i].definePontos();

                        GrupoATimes[i].defineSaldoDeGols();

                        GrupoAArrayList.add(GrupoATimes[i]);

                    }

                    Collections.sort(GrupoAArrayList, new Comparador());

                    for (int i = 0; i < GrupoAArrayList.size(); i++) {

                        times[i].setText(GrupoAArrayList.get(i).getNome());

                        times[i].setIcon(GrupoAArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoAArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoAArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoAArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoAArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoAArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoAArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoAArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoAArrayList.get(i).getCaminhoBandeira());

                    }

                    A1.setText(GrupoAArrayList.get(0).getNome());

                    A2.setText(GrupoAArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoB, Time2GrupoB, Time3GrupoB, Time4GrupoB};

                    JLabel[] vitorias = new JLabel[]{V1B, V2B, V3B, V4B};

                    JLabel[] empates = new JLabel[]{E1B, E2B, E3B, E4B};

                    JLabel[] derrotas = new JLabel[]{D1B, D2B, D3B, D4B};

                    JLabel[] golsPro = new JLabel[]{GP1B, GP2B, GP3B, GP4B};

                    JLabel[] golsCon = new JLabel[]{GC1B, GC2B, GC3B, GC4B};

                    JLabel[] saldoGols = new JLabel[]{SG1B, SG2B, SG3B, SG4B};

                    JLabel[] pontos = new JLabel[]{PTS1B, PTS2B, PTS3B, PTS4B};

                    JLabel[] caminhosBandeira = new JLabel[]{C1B, C2B, C3B, C4B};

                    ArrayList<Time> GrupoBArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoBTexts.length; i++){

                        if(Integer.parseInt(GrupoBTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoBTimes.length; i++) {

                        GrupoBArrayList.add(GrupoBTimes[i]);

                    }

                    for (int i = 0; i < GrupoBArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoBArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 6).setGols1(Integer.parseInt(GrupoBTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 6).getTime1().addGols(Integer.parseInt(GrupoBTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 6).getTime2().addGolsSofridos(Integer.parseInt(GrupoBTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 6).setGols2(Integer.parseInt(GrupoBTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 6).getTime2().addGols(Integer.parseInt(GrupoBTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 6).getTime1().addGolsSofridos(Integer.parseInt(GrupoBTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 6).definePontos();

                        copa.getPartidas().get(i + 6).defineVDE();

                    }

                    for (int i = 0; i < GrupoBTimes.length; i++) {

                        GrupoBArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoBTimes.length; i++) {

                        GrupoBTimes[i].definePontos();

                        GrupoBTimes[i].defineSaldoDeGols();

                        GrupoBArrayList.add(GrupoBTimes[i]);

                    }

                    Collections.sort(GrupoBArrayList, new Comparador());

                    for (int i = 0; i < GrupoBArrayList.size(); i++) {

                        times[i].setText(GrupoBArrayList.get(i).getNome());

                        times[i].setIcon(GrupoBArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoBArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoBArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoBArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoBArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoBArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoBArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoBArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoBArrayList.get(i).getCaminhoBandeira());

                    }

                    B1.setText(GrupoBArrayList.get(0).getNome());

                    B2.setText(GrupoBArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }
            }
        });
        enviarBotaoGrupoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoC, Time2GrupoC, Time3GrupoC, Time4GrupoC};

                    JLabel[] vitorias = new JLabel[]{V1C, V2C, V3C, V4C};

                    JLabel[] empates = new JLabel[]{E1C, E2C, E3C, E4C};

                    JLabel[] derrotas = new JLabel[]{D1C, D2C, D3C, D4C};

                    JLabel[] golsPro = new JLabel[]{GP1C, GP2C, GP3C, GP4C};

                    JLabel[] golsCon = new JLabel[]{GC1C, GC2C, GC3C, GC4C};

                    JLabel[] saldoGols = new JLabel[]{SG1C, SG2C, SG3C, SG4C};

                    JLabel[] pontos = new JLabel[]{PTS1C, PTS2C, PTS3C, PTS4C};

                    JLabel[] caminhosBandeira = new JLabel[]{C1C, C2C, C3C, C4C};

                    ArrayList<Time> GrupoCArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoCTexts.length; i++){

                        if(Integer.parseInt(GrupoCTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoCTimes.length; i++) {

                        GrupoCArrayList.add(GrupoCTimes[i]);

                    }

                    for (int i = 0; i < GrupoCArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoCArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 12).setGols1(Integer.parseInt(GrupoCTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 12).getTime1().addGols(Integer.parseInt(GrupoCTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 12).getTime2().addGolsSofridos(Integer.parseInt(GrupoCTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 12).setGols2(Integer.parseInt(GrupoCTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 12).getTime2().addGols(Integer.parseInt(GrupoCTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 12).getTime1().addGolsSofridos(Integer.parseInt(GrupoCTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 12).definePontos();

                        copa.getPartidas().get(i + 12).defineVDE();

                    }

                    for (int i = 0; i < GrupoCTimes.length; i++) {

                        GrupoCArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoCTimes.length; i++) {

                        GrupoCTimes[i].definePontos();

                        GrupoCTimes[i].defineSaldoDeGols();

                        GrupoCArrayList.add(GrupoCTimes[i]);

                    }

                    Collections.sort(GrupoCArrayList, new Comparador());

                    for (int i = 0; i < GrupoCArrayList.size(); i++) {

                        times[i].setText(GrupoCArrayList.get(i).getNome());

                        times[i].setIcon(GrupoCArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoCArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoCArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoCArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoCArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoCArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoCArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoCArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoCArrayList.get(i).getCaminhoBandeira());

                    }

                    C1.setText(GrupoCArrayList.get(0).getNome());

                    C2.setText(GrupoCArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGupoD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoD, Time2GrupoD, Time3GrupoD, Time4GrupoD};

                    JLabel[] vitorias = new JLabel[]{V1D, V2D, V3D, V4D};

                    JLabel[] empates = new JLabel[]{E1D, E2D, E3D, E4D};

                    JLabel[] derrotas = new JLabel[]{D1D, D2D, D3D, D4D};

                    JLabel[] golsPro = new JLabel[]{GP1D, GP2D, GP3D, GP4D};

                    JLabel[] golsCon = new JLabel[]{GC1D, GC2D, GC3D, GC4D};

                    JLabel[] saldoGols = new JLabel[]{SG1D, SG2D, SG3D, SG4D};

                    JLabel[] pontos = new JLabel[]{PTS1D, PTS2D, PTS3D, PTS4D};

                    JLabel[] caminhosBandeira = new JLabel[]{C1D, C2D, C3D, C4D};

                    ArrayList<Time> GrupoDArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoDTexts.length; i++){

                        if(Integer.parseInt(GrupoDTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoDTimes.length; i++) {

                        GrupoDArrayList.add(GrupoDTimes[i]);

                    }

                    for (int i = 0; i < GrupoDArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoDArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 18).setGols1(Integer.parseInt(GrupoDTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 18).getTime1().addGols(Integer.parseInt(GrupoDTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 18).getTime2().addGolsSofridos(Integer.parseInt(GrupoDTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 18).setGols2(Integer.parseInt(GrupoDTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 18).getTime2().addGols(Integer.parseInt(GrupoDTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 18).getTime1().addGolsSofridos(Integer.parseInt(GrupoDTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 18).definePontos();

                        copa.getPartidas().get(i + 18).defineVDE();

                    }

                    for (int i = 0; i < GrupoDTimes.length; i++) {

                        GrupoDArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoDTimes.length; i++) {

                        GrupoDTimes[i].definePontos();

                        GrupoDTimes[i].defineSaldoDeGols();

                        GrupoDArrayList.add(GrupoDTimes[i]);

                    }

                    Collections.sort(GrupoDArrayList, new Comparador());

                    for (int i = 0; i < GrupoDArrayList.size(); i++) {

                        times[i].setText(GrupoDArrayList.get(i).getNome());

                        times[i].setIcon(GrupoDArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoDArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoDArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoDArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoDArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoDArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoDArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoDArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoDArrayList.get(i).getCaminhoBandeira());

                    }

                    D1.setText(GrupoDArrayList.get(0).getNome());

                    D2.setText(GrupoDArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoE, Time2GrupoE, Time3GrupoE, Time4GrupoE};

                    JLabel[] vitorias = new JLabel[]{V1E, V2E, V3E, V4E};

                    JLabel[] empates = new JLabel[]{E1E, E2E, E3E, E4E};

                    JLabel[] derrotas = new JLabel[]{D1E, D2E, D3E, D4E};

                    JLabel[] golsPro = new JLabel[]{GP1E, GP2E, GP3E, GP4E};

                    JLabel[] golsCon = new JLabel[]{GC1E, GC2E, GC3E, GC4E};

                    JLabel[] saldoGols = new JLabel[]{SG1E, SG2E, SG3E, SG4E};

                    JLabel[] pontos = new JLabel[]{PTS1E, PTS2E, PTS3E, PTS4E};

                    JLabel[] caminhosBandeira = new JLabel[]{C1E, C2E, C3E, C4E};

                    ArrayList<Time> GrupoEArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoETexts.length; i++){

                        if(Integer.parseInt(GrupoETexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoETimes.length; i++) {

                        GrupoEArrayList.add(GrupoETimes[i]);

                    }

                    for (int i = 0; i < GrupoEArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoEArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 24).setGols1(Integer.parseInt(GrupoETexts[2 * i].getText()));

                        copa.getPartidas().get(i + 24).getTime1().addGols(Integer.parseInt(GrupoETexts[2 * i].getText()));

                        copa.getPartidas().get(i + 24).getTime2().addGolsSofridos(Integer.parseInt(GrupoETexts[2 * i].getText()));

                        copa.getPartidas().get(i + 24).setGols2(Integer.parseInt(GrupoETexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 24).getTime2().addGols(Integer.parseInt(GrupoETexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 24).getTime1().addGolsSofridos(Integer.parseInt(GrupoETexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 24).definePontos();

                        copa.getPartidas().get(i + 24).defineVDE();

                    }

                    for (int i = 0; i < GrupoETimes.length; i++) {

                        GrupoEArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoETimes.length; i++) {

                        GrupoETimes[i].definePontos();

                        GrupoETimes[i].defineSaldoDeGols();

                        GrupoEArrayList.add(GrupoETimes[i]);

                    }

                    Collections.sort(GrupoEArrayList, new Comparador());

                    for (int i = 0; i < GrupoEArrayList.size(); i++) {

                        times[i].setText(GrupoEArrayList.get(i).getNome());

                        times[i].setIcon(GrupoEArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoEArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoEArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoEArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoEArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoEArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoEArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoEArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoEArrayList.get(i).getCaminhoBandeira());

                    }

                    E1.setText(GrupoEArrayList.get(0).getNome());

                    E2.setText(GrupoEArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGupoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoF, Time2GrupoF, Time3GrupoF, Time4GrupoF};

                    JLabel[] vitorias = new JLabel[]{V1F, V2F, V3F, V4F};

                    JLabel[] empates = new JLabel[]{E1F, E2F, E3F, E4F};

                    JLabel[] derrotas = new JLabel[]{D1F, D2F, D3F, D4F};

                    JLabel[] golsPro = new JLabel[]{GP1F, GP2F, GP3F, GP4F};

                    JLabel[] golsCon = new JLabel[]{GC1F, GC2F, GC3F, GC4F};

                    JLabel[] saldoGols = new JLabel[]{SG1F, SG2F, SG3F, SG4F};

                    JLabel[] pontos = new JLabel[]{PTS1F, PTS2F, PTS3F, PTS4F};

                    JLabel[] caminhosBandeira = new JLabel[]{C1F, C2F, C3F, C4F};

                    ArrayList<Time> GrupoFArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoFTexts.length; i++){

                        if(Integer.parseInt(GrupoFTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoFTimes.length; i++) {

                        GrupoFArrayList.add(GrupoFTimes[i]);

                    }

                    for (int i = 0; i < GrupoFArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoFArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 30).setGols1(Integer.parseInt(GrupoFTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 30).getTime1().addGols(Integer.parseInt(GrupoFTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 30).getTime2().addGolsSofridos(Integer.parseInt(GrupoFTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 30).setGols2(Integer.parseInt(GrupoFTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 30).getTime2().addGols(Integer.parseInt(GrupoFTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 30).getTime1().addGolsSofridos(Integer.parseInt(GrupoFTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 30).definePontos();

                        copa.getPartidas().get(i + 30).defineVDE();

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoFArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoFTimes.length; i++) {

                        GrupoFTimes[i].definePontos();

                        GrupoFTimes[i].defineSaldoDeGols();

                        GrupoFArrayList.add(GrupoFTimes[i]);

                    }

                    Collections.sort(GrupoFArrayList, new Comparador());

                    for (int i = 0; i < GrupoFArrayList.size(); i++) {

                        times[i].setText(GrupoFArrayList.get(i).getNome());

                        times[i].setIcon(GrupoFArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoFArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoFArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoFArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoFArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoFArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoFArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoFArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoFArrayList.get(i).getCaminhoBandeira());

                    }

                    F1.setText(GrupoFArrayList.get(0).getNome());

                    F2.setText(GrupoFArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoG, Time2GrupoG, Time3GrupoG, Time4GrupoG};

                    JLabel[] vitorias = new JLabel[]{V1G, V2G, V3G, V4G};

                    JLabel[] empates = new JLabel[]{E1G, E2G, E3G, E4G};

                    JLabel[] derrotas = new JLabel[]{D1G, D2G, D3G, D4G};

                    JLabel[] golsPro = new JLabel[]{GP1G, GP2G, GP3G, GP4G};

                    JLabel[] golsCon = new JLabel[]{GC1G, GC2G, GC3G, GC4G};

                    JLabel[] saldoGols = new JLabel[]{SG1G, SG2G, SG3G, SG4G};

                    JLabel[] pontos = new JLabel[]{PTS1G, PTS2G, PTS3G, PTS4G};

                    JLabel[] caminhosBandeira = new JLabel[]{C1G, C2G, C3G, C4G};

                    ArrayList<Time> GrupoGArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoGTexts.length; i++){

                        if(Integer.parseInt(GrupoGTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoGTimes.length; i++) {

                        GrupoGArrayList.add(GrupoGTimes[i]);

                    }

                    for (int i = 0; i < GrupoGArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoGArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 36).setGols1(Integer.parseInt(GrupoGTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 36).getTime1().addGols(Integer.parseInt(GrupoGTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 36).getTime2().addGolsSofridos(Integer.parseInt(GrupoGTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 36).setGols2(Integer.parseInt(GrupoGTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 36).getTime2().addGols(Integer.parseInt(GrupoGTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 36).getTime1().addGolsSofridos(Integer.parseInt(GrupoGTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 36).definePontos();

                        copa.getPartidas().get(i + 36).defineVDE();

                    }

                    for (int i = 0; i < GrupoGTimes.length; i++) {

                        GrupoGArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoGTimes.length; i++) {

                        GrupoGTimes[i].definePontos();

                        GrupoGTimes[i].defineSaldoDeGols();

                        GrupoGArrayList.add(GrupoGTimes[i]);

                    }

                    Collections.sort(GrupoGArrayList, new Comparador());

                    for (int i = 0; i < GrupoGArrayList.size(); i++) {

                        times[i].setText(GrupoGArrayList.get(i).getNome());

                        times[i].setIcon(GrupoGArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoGArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoGArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoGArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoGArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoGArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoGArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoGArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoGArrayList.get(i).getCaminhoBandeira());

                    }

                    G1.setText(GrupoGArrayList.get(0).getNome());

                    G2.setText(GrupoGArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoH, Time2GrupoH, Time3GrupoH, Time4GrupoH};

                    JLabel[] vitorias = new JLabel[]{V1H, V2H, V3H, V4H};

                    JLabel[] empates = new JLabel[]{E1H, E2H, E3H, E4H};

                    JLabel[] derrotas = new JLabel[]{D1H, D2H, D3H, D4H};

                    JLabel[] golsPro = new JLabel[]{GP1H, GP2H, GP3H, GP4H};

                    JLabel[] golsCon = new JLabel[]{GC1H, GC2H, GC3H, GC4H};

                    JLabel[] saldoGols = new JLabel[]{SG1H, SG2H, SG3H, SG4H};

                    JLabel[] pontos = new JLabel[]{PTS1H, PTS2H, PTS3H, PTS4H};

                    JLabel[] caminhosBandeira = new JLabel[]{C1H, C2H, C3H, C4H};

                    ArrayList<Time> GrupoHArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoHTexts.length; i++){

                        if(Integer.parseInt(GrupoHTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoHTimes.length; i++) {

                        GrupoHArrayList.add(GrupoHTimes[i]);

                    }

                    for (int i = 0; i < GrupoHArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoHArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 42).setGols1(Integer.parseInt(GrupoHTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 42).getTime1().addGols(Integer.parseInt(GrupoHTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 42).getTime2().addGolsSofridos(Integer.parseInt(GrupoHTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 42).setGols2(Integer.parseInt(GrupoHTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 42).getTime2().addGols(Integer.parseInt(GrupoHTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 42).getTime1().addGolsSofridos(Integer.parseInt(GrupoHTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 42).definePontos();

                        copa.getPartidas().get(i + 42).defineVDE();

                    }

                    for (int i = 0; i < GrupoHTimes.length; i++) {

                        GrupoHArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoHTimes.length; i++) {

                        GrupoHTimes[i].definePontos();

                        GrupoHTimes[i].defineSaldoDeGols();

                        GrupoHArrayList.add(GrupoHTimes[i]);

                    }

                    Collections.sort(GrupoHArrayList, new Comparador());

                    for (int i = 0; i < GrupoHArrayList.size(); i++) {

                        times[i].setText(GrupoHArrayList.get(i).getNome());

                        times[i].setIcon(GrupoHArrayList.get(i).getBandeira());

                        vitorias[i].setText(Integer.toString(GrupoHArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoHArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoHArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoHArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoHArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoHArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoHArrayList.get(i).getPontos()));

                        caminhosBandeira[i].setText(GrupoHArrayList.get(i).getCaminhoBandeira());

                    }

                    H1.setText(GrupoHArrayList.get(0).getNome());

                    H2.setText(GrupoHArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }
            }
        });

        enviarOitavas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!A1.getText().equals("1A") && !B2.getText().equals("2B")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas1.getText()) >= 0 && Integer.parseInt(Gols2Oitavas1.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas1.getText()) == Integer.parseInt(Gols2Oitavas1.getText())) {

                                Penaltis1Oitavas1.setEditable(true);

                                Penaltis2Oitavas1.setEditable(true);

                                Gols1Oitavas1.setEditable(false);

                                Gols2Oitavas1.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas1.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas1.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas1.getText()) > Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                        VencedorOitavas1.setText(A1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas1.getText()) < Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                        VencedorOitavas1.setText(B2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas1.getText()) == Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas1.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas1.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas1.setText("0");

                                            Penaltis2Oitavas1.setText("0");

                                            Penaltis1Oitavas1.setEditable(false);

                                            Penaltis2Oitavas1.setEditable(false);

                                            Gols1Oitavas1.setEditable(true);

                                            Gols2Oitavas1.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas1.getText()) > Integer.parseInt(Gols2Oitavas1.getText())) {

                                VencedorOitavas1.setText(A1.getText());

                            } else {

                                VencedorOitavas1.setText(B2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas1.setText("0");

                        Penaltis2Oitavas1.setText("0");

                        Penaltis1Oitavas1.setEditable(false);

                        Penaltis2Oitavas1.setEditable(false);

                        Gols1Oitavas1.setEditable(true);

                        Gols2Oitavas1.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }
            }
        });

        enviarOitavas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!C1.getText().equals("1C") && !D2.getText().equals("2D")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas2.getText()) >= 0 && Integer.parseInt(Gols2Oitavas2.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas2.getText()) == Integer.parseInt(Gols2Oitavas2.getText())) {

                                Penaltis1Oitavas2.setEditable(true);

                                Penaltis2Oitavas2.setEditable(true);

                                Gols1Oitavas2.setEditable(false);

                                Gols2Oitavas2.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas2.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas2.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas2.getText()) > Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                        VencedorOitavas2.setText(C1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas2.getText()) < Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                        VencedorOitavas2.setText(D2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas2.getText()) == Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas2.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas2.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas2.setText("0");

                                            Penaltis2Oitavas2.setText("0");

                                            Penaltis1Oitavas2.setEditable(false);

                                            Penaltis2Oitavas2.setEditable(false);

                                            Gols1Oitavas2.setEditable(true);

                                            Gols2Oitavas2.setEditable(true);
                                        }

                                    }

                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas2.getText()) > Integer.parseInt(Gols2Oitavas2.getText())) {

                                VencedorOitavas2.setText(C1.getText());

                            } else {

                                VencedorOitavas2.setText(D2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas2.setText("0");

                        Penaltis2Oitavas2.setText("0");

                        Penaltis1Oitavas2.setEditable(false);

                        Penaltis2Oitavas2.setEditable(false);

                        Gols1Oitavas2.setEditable(true);

                        Gols2Oitavas2.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!E1.getText().equals("1E") && !F2.getText().equals("2F")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas3.getText()) >= 0 && Integer.parseInt(Gols2Oitavas3.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas3.getText()) == Integer.parseInt(Gols2Oitavas3.getText())) {

                                Penaltis1Oitavas3.setEditable(true);

                                Penaltis2Oitavas3.setEditable(true);

                                Gols1Oitavas3.setEditable(false);

                                Gols2Oitavas3.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas3.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas3.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas3.getText()) > Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                        VencedorOitavas3.setText(E1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas3.getText()) < Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                        VencedorOitavas3.setText(F2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas3.getText()) == Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas3.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas3.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas3.setText("0");

                                            Penaltis2Oitavas3.setText("0");

                                            Penaltis1Oitavas3.setEditable(false);

                                            Penaltis2Oitavas3.setEditable(false);

                                            Gols1Oitavas3.setEditable(true);

                                            Gols2Oitavas3.setEditable(true);
                                        }

                                    }

                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas3.getText()) > Integer.parseInt(Gols2Oitavas3.getText())) {

                                VencedorOitavas3.setText(E1.getText());

                            } else {

                                VencedorOitavas3.setText(F2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas3.setText("0");

                        Penaltis2Oitavas3.setText("0");

                        Penaltis1Oitavas3.setEditable(false);

                        Penaltis2Oitavas3.setEditable(false);

                        Gols1Oitavas3.setEditable(true);

                        Gols2Oitavas3.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }
            }
        });

        enviarOitavas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!G1.getText().equals("1G") && !H2.getText().equals("2H")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas4.getText()) >= 0 && Integer.parseInt(Gols2Oitavas4.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas4.getText()) == Integer.parseInt(Gols2Oitavas4.getText())) {

                                Penaltis1Oitavas4.setEditable(true);

                                Penaltis2Oitavas4.setEditable(true);

                                Gols1Oitavas4.setEditable(false);

                                Gols2Oitavas4.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas4.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas4.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas4.getText()) > Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                        VencedorOitavas4.setText(G1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas4.getText()) < Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                        VencedorOitavas4.setText(H2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas4.getText()) == Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas4.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas4.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas4.setText("0");

                                            Penaltis2Oitavas4.setText("0");

                                            Penaltis1Oitavas4.setEditable(false);

                                            Penaltis2Oitavas4.setEditable(false);

                                            Gols1Oitavas4.setEditable(true);

                                            Gols2Oitavas4.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas4.getText()) > Integer.parseInt(Gols2Oitavas4.getText())) {

                                VencedorOitavas4.setText(G1.getText());

                            } else {

                                VencedorOitavas4.setText(H2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas4.setText("0");

                        Penaltis2Oitavas4.setText("0");

                        Penaltis1Oitavas4.setEditable(false);

                        Penaltis2Oitavas4.setEditable(false);

                        Gols1Oitavas4.setEditable(true);

                        Gols2Oitavas4.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!B1.getText().equals("1B") && !A2.getText().equals("2A")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas5.getText()) >= 0 && Integer.parseInt(Gols2Oitavas5.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas5.getText()) == Integer.parseInt(Gols2Oitavas5.getText())) {

                                Penaltis1Oitavas5.setEditable(true);

                                Penaltis2Oitavas5.setEditable(true);

                                Gols1Oitavas5.setEditable(false);

                                Gols2Oitavas5.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas5.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas5.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas5.getText()) > Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                        VencedorOitavas5.setText(B1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas5.getText()) < Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                        VencedorOitavas5.setText(A2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas5.getText()) == Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas5.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas5.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas5.setText("0");

                                            Penaltis2Oitavas5.setText("0");

                                            Penaltis1Oitavas5.setEditable(false);

                                            Penaltis2Oitavas5.setEditable(false);

                                            Gols1Oitavas5.setEditable(true);

                                            Gols2Oitavas5.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas5.getText()) > Integer.parseInt(Gols2Oitavas5.getText())) {

                                VencedorOitavas5.setText(B1.getText());

                            } else {

                                VencedorOitavas5.setText(A2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas5.setText("0");

                        Penaltis2Oitavas5.setText("0");

                        Penaltis1Oitavas5.setEditable(false);

                        Penaltis2Oitavas5.setEditable(false);

                        Gols1Oitavas5.setEditable(true);

                        Gols2Oitavas5.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!D1.getText().equals("1D") && !C2.getText().equals("2C")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas6.getText()) >= 0 && Integer.parseInt(Gols2Oitavas6.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas6.getText()) == Integer.parseInt(Gols2Oitavas6.getText())) {

                                Penaltis1Oitavas6.setEditable(true);

                                Penaltis2Oitavas6.setEditable(true);

                                Gols1Oitavas6.setEditable(false);

                                Gols2Oitavas6.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas6.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas6.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas6.getText()) > Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                        VencedorOitavas6.setText(D1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas6.getText()) < Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                        VencedorOitavas6.setText(C2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas6.getText()) == Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas6.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas6.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas6.setText("0");

                                            Penaltis2Oitavas6.setText("0");

                                            Penaltis1Oitavas6.setEditable(false);

                                            Penaltis2Oitavas6.setEditable(false);

                                            Gols1Oitavas6.setEditable(true);

                                            Gols2Oitavas6.setEditable(true);

                                        }

                                    }

                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas6.getText()) > Integer.parseInt(Gols2Oitavas6.getText())) {

                                VencedorOitavas6.setText(D1.getText());

                            } else {

                                VencedorOitavas6.setText(C2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas6.setText("0");

                        Penaltis2Oitavas6.setText("0");

                        Penaltis1Oitavas6.setEditable(false);

                        Penaltis2Oitavas6.setEditable(false);

                        Gols1Oitavas6.setEditable(true);

                        Gols2Oitavas6.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!F1.getText().equals("1F") && !E2.getText().equals("2E")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas7.getText()) >= 0 && Integer.parseInt(Gols2Oitavas7.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas7.getText()) == Integer.parseInt(Gols2Oitavas7.getText())) {

                                Penaltis1Oitavas7.setEditable(true);

                                Penaltis2Oitavas7.setEditable(true);

                                Gols1Oitavas7.setEditable(false);

                                Gols2Oitavas7.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas7.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas7.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas7.getText()) > Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                        VencedorOitavas7.setText(F1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas7.getText()) < Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                        VencedorOitavas7.setText(E2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas7.getText()) == Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas7.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas7.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas7.setText("0");

                                            Penaltis2Oitavas7.setText("0");

                                            Penaltis1Oitavas7.setEditable(false);

                                            Penaltis2Oitavas7.setEditable(false);

                                            Gols1Oitavas7.setEditable(true);

                                            Gols2Oitavas7.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas7.getText()) > Integer.parseInt(Gols2Oitavas7.getText())) {

                                VencedorOitavas7.setText(F1.getText());

                            } else {

                                VencedorOitavas7.setText(E2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas7.setText("0");

                        Penaltis2Oitavas7.setText("0");

                        Penaltis1Oitavas7.setEditable(false);

                        Penaltis2Oitavas7.setEditable(false);

                        Gols1Oitavas7.setEditable(true);

                        Gols2Oitavas7.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!H1.getText().equals("1H") && !G2.getText().equals("2G")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas8.getText()) >= 0 && Integer.parseInt(Gols2Oitavas8.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas8.getText()) == Integer.parseInt(Gols2Oitavas8.getText())) {

                                Penaltis1Oitavas8.setEditable(true);

                                Penaltis2Oitavas8.setEditable(true);

                                Gols1Oitavas8.setEditable(false);

                                Gols2Oitavas8.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas8.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas8.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas8.getText()) > Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                        VencedorOitavas8.setText(H1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas8.getText()) < Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                        VencedorOitavas8.setText(G2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas8.getText()) == Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas8.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas8.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas8.setText("0");

                                            Penaltis2Oitavas8.setText("0");

                                            Penaltis1Oitavas8.setEditable(false);

                                            Penaltis2Oitavas8.setEditable(false);

                                            Gols1Oitavas8.setEditable(true);

                                            Gols2Oitavas8.setEditable(true);

                                        }
                                    }
                                }

                                else {

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas8.getText()) > Integer.parseInt(Gols2Oitavas8.getText())) {

                                VencedorOitavas8.setText(H1.getText());

                            } else {

                                VencedorOitavas8.setText(G2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas8.setText("0");

                        Penaltis2Oitavas8.setText("0");

                        Penaltis1Oitavas8.setEditable(false);

                        Penaltis2Oitavas8.setEditable(false);

                        Gols1Oitavas8.setEditable(true);

                        Gols2Oitavas8.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas1.getText().equals("A definir") && !VencedorOitavas2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas1.getText()) >= 0 && Integer.parseInt(Gols2Quartas1.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas1.getText()) == Integer.parseInt(Gols2Quartas1.getText())) {

                                Penaltis1Quartas1.setEditable(true);

                                Penaltis2Quartas1.setEditable(true);

                                Gols1Quartas1.setEditable(false);

                                Gols2Quartas1.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas1.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas1.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas1.getText()) > Integer.parseInt(Penaltis2Quartas1.getText())) {

                                        VencedorQuartas1.setText(VencedorOitavas1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas1.getText()) < Integer.parseInt(Penaltis2Quartas1.getText())) {

                                        VencedorQuartas1.setText(VencedorOitavas2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas1.getText()) == Integer.parseInt(Penaltis2Quartas1.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas1.getText()) == 0 && Integer.parseInt(Penaltis2Quartas1.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas1.setText("0");

                                            Penaltis2Quartas1.setText("0");

                                            Penaltis1Quartas1.setEditable(false);

                                            Penaltis2Quartas1.setEditable(false);

                                            Gols1Quartas1.setEditable(true);

                                            Gols2Quartas1.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas1.getText()) > Integer.parseInt(Gols2Quartas1.getText())) {

                                VencedorQuartas1.setText(VencedorOitavas1.getText());

                            } else {

                                VencedorQuartas1.setText(VencedorOitavas2.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas1.setText("0");

                        Penaltis2Quartas1.setText("0");

                        Penaltis1Quartas1.setEditable(false);

                        Penaltis2Quartas1.setEditable(false);

                        Gols1Quartas1.setEditable(true);

                        Gols2Quartas1.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas3.getText().equals("A definir")  && !VencedorOitavas4.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas2.getText()) >= 0 && Integer.parseInt(Gols2Quartas2.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas2.getText()) == Integer.parseInt(Gols2Quartas2.getText())) {

                                Penaltis1Quartas2.setEditable(true);

                                Penaltis2Quartas2.setEditable(true);

                                Gols1Quartas2.setEditable(false);

                                Gols2Quartas2.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas2.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas2.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas2.getText()) > Integer.parseInt(Penaltis2Quartas2.getText())) {

                                        VencedorQuartas2.setText(VencedorOitavas3.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas2.getText()) < Integer.parseInt(Penaltis2Quartas2.getText())) {

                                        VencedorQuartas2.setText(VencedorOitavas4.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas2.getText()) == Integer.parseInt(Penaltis2Quartas2.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas2.getText()) == 0 && Integer.parseInt(Penaltis2Quartas2.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas2.setText("0");

                                            Penaltis2Quartas2.setText("0");

                                            Penaltis1Quartas2.setEditable(false);

                                            Penaltis2Quartas2.setEditable(false);

                                            Gols1Quartas2.setEditable(true);

                                            Gols2Quartas2.setEditable(true);

                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas2.getText()) > Integer.parseInt(Gols2Quartas2.getText())) {

                                VencedorQuartas2.setText(VencedorOitavas3.getText());

                            } else {

                                VencedorQuartas2.setText(VencedorOitavas4.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas2.setText("0");

                        Penaltis2Quartas2.setText("0");

                        Penaltis1Quartas2.setEditable(false);

                        Penaltis2Quartas2.setEditable(false);

                        Gols1Quartas2.setEditable(true);

                        Gols2Quartas2.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas5.getText().equals("A definir") && !VencedorOitavas6.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas3.getText()) >= 0 && Integer.parseInt(Gols2Quartas3.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas3.getText()) == Integer.parseInt(Gols2Quartas3.getText())) {

                                Penaltis1Quartas3.setEditable(true);

                                Penaltis2Quartas3.setEditable(true);

                                Gols1Quartas3.setEditable(false);

                                Gols2Quartas3.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas3.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas3.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas3.getText()) > Integer.parseInt(Penaltis2Quartas3.getText())) {

                                        VencedorQuartas3.setText(VencedorOitavas5.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas3.getText()) < Integer.parseInt(Penaltis2Quartas3.getText())) {

                                        VencedorQuartas3.setText(VencedorOitavas6.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas3.getText()) == Integer.parseInt(Penaltis2Quartas3.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas3.getText()) == 0 && Integer.parseInt(Penaltis2Quartas3.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas3.setText("0");

                                            Penaltis2Quartas3.setText("0");

                                            Penaltis1Quartas3.setEditable(false);

                                            Penaltis2Quartas3.setEditable(false);

                                            Gols1Quartas3.setEditable(true);

                                            Gols2Quartas3.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas3.getText()) > Integer.parseInt(Gols2Quartas3.getText())) {

                                VencedorQuartas3.setText(VencedorOitavas5.getText());

                            } else {

                                VencedorQuartas3.setText(VencedorOitavas6.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas3.setText("0");

                        Penaltis2Quartas3.setText("0");

                        Penaltis1Quartas3.setEditable(false);

                        Penaltis2Quartas3.setEditable(false);

                        Gols1Quartas3.setEditable(true);

                        Gols2Quartas3.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas7.getText().equals("A definir") && !VencedorOitavas8.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas4.getText()) >= 0 && Integer.parseInt(Gols2Quartas4.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas4.getText()) == Integer.parseInt(Gols2Quartas4.getText())) {

                                Penaltis1Quartas4.setEditable(true);

                                Penaltis2Quartas4.setEditable(true);

                                Gols1Quartas4.setEditable(false);

                                Gols2Quartas4.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas4.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas4.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas4.getText()) > Integer.parseInt(Penaltis2Quartas4.getText())) {

                                        VencedorQuartas4.setText(VencedorOitavas7.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas4.getText()) < Integer.parseInt(Penaltis2Quartas4.getText())) {

                                        VencedorQuartas4.setText(VencedorOitavas8.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas4.getText()) == Integer.parseInt(Penaltis2Quartas4.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas4.getText()) == 0 && Integer.parseInt(Penaltis2Quartas4.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas4.setText("0");

                                            Penaltis2Quartas4.setText("0");

                                            Penaltis1Quartas4.setEditable(false);

                                            Penaltis2Quartas4.setEditable(false);

                                            Gols1Quartas4.setEditable(true);

                                            Gols2Quartas4.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas4.getText()) > Integer.parseInt(Gols2Quartas4.getText())) {

                                VencedorQuartas4.setText(VencedorOitavas7.getText());

                            } else {

                                VencedorQuartas4.setText(VencedorOitavas8.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas4.setText("0");

                        Penaltis2Quartas4.setText("0");

                        Penaltis1Quartas4.setEditable(false);

                        Penaltis2Quartas4.setEditable(false);

                        Gols1Quartas4.setEditable(true);

                        Gols2Quartas4.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarSemi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorQuartas1.getText().equals("A definir") && !VencedorQuartas2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Semi1.getText()) >= 0 && Integer.parseInt(Gols2Semi1.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Semi1.getText()) == Integer.parseInt(Gols2Semi1.getText())) {

                                Penaltis1Semi1.setEditable(true);

                                Penaltis2Semi1.setEditable(true);

                                Gols1Semi1.setEditable(false);

                                Gols2Semi1.setEditable(false);

                                if(Integer.parseInt(Penaltis1Semi1.getText()) >= 0 && Integer.parseInt(Penaltis2Semi1.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Semi1.getText()) > Integer.parseInt(Penaltis2Semi1.getText())) {

                                        VencedorSemi1.setText(VencedorQuartas1.getText());

                                        PerderdorSemi1.setText(VencedorQuartas2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi1.getText()) < Integer.parseInt(Penaltis2Semi1.getText())) {

                                        VencedorSemi1.setText(VencedorQuartas2.getText());

                                        PerderdorSemi1.setText(VencedorQuartas1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi1.getText()) == Integer.parseInt(Penaltis2Semi1.getText())) {

                                        if (Integer.parseInt(Penaltis1Semi1.getText()) == 0 && Integer.parseInt(Penaltis2Semi1.getText()) == 0) {
                                        } else {

                                            Penaltis1Semi1.setText("0");

                                            Penaltis2Semi1.setText("0");

                                            Penaltis1Semi1.setEditable(false);

                                            Penaltis2Semi1.setEditable(false);

                                            Gols1Semi1.setEditable(true);

                                            Gols2Semi1.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Semi1.getText()) > Integer.parseInt(Gols2Semi1.getText())) {

                                VencedorSemi1.setText(VencedorQuartas1.getText());

                                PerderdorSemi1.setText(VencedorQuartas2.getText());

                            } else {

                                VencedorSemi1.setText(VencedorQuartas2.getText());

                                PerderdorSemi1.setText(VencedorQuartas1.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Semi1.setText("0");

                        Penaltis2Semi1.setText("0");

                        Penaltis1Semi1.setEditable(false);

                        Penaltis2Semi1.setEditable(false);

                        Gols1Semi1.setEditable(true);

                        Gols2Semi1.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarSemi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorQuartas3.getText().equals("A definir") && !VencedorQuartas4.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Semi2.getText()) >= 0 && Integer.parseInt(Gols2Semi2.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Semi2.getText()) == Integer.parseInt(Gols2Semi2.getText())) {

                                Penaltis1Semi2.setEditable(true);

                                Penaltis2Semi2.setEditable(true);

                                Gols1Semi2.setEditable(false);

                                Gols2Semi2.setEditable(false);

                                if(Integer.parseInt(Penaltis1Semi2.getText()) >= 0 && Integer.parseInt(Penaltis2Semi2.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Semi2.getText()) > Integer.parseInt(Penaltis2Semi2.getText())) {

                                        VencedorSemi2.setText(VencedorQuartas3.getText());

                                        PerderdorSemi2.setText(VencedorQuartas4.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi2.getText()) < Integer.parseInt(Penaltis2Semi2.getText())) {

                                        VencedorSemi2.setText(VencedorQuartas4.getText());

                                        PerderdorSemi2.setText(VencedorQuartas3.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi2.getText()) == Integer.parseInt(Penaltis2Semi2.getText())) {

                                        if (Integer.parseInt(Penaltis1Semi2.getText()) == 0 && Integer.parseInt(Penaltis2Semi2.getText()) == 0) {
                                        } else {

                                            Penaltis1Semi2.setText("0");

                                            Penaltis2Semi2.setText("0");

                                            Penaltis1Semi2.setEditable(false);

                                            Penaltis2Semi2.setEditable(false);

                                            Gols1Semi2.setEditable(true);

                                            Gols2Semi2.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Semi2.getText()) > Integer.parseInt(Gols2Semi2.getText())) {

                                VencedorSemi2.setText(VencedorQuartas3.getText());

                                PerderdorSemi2.setText(VencedorQuartas4.getText());

                            } else {

                                VencedorSemi2.setText(VencedorQuartas4.getText());

                                PerderdorSemi2.setText(VencedorQuartas3.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Semi2.setText("0");

                        Penaltis2Semi2.setText("0");

                        Penaltis1Semi2.setEditable(false);

                        Penaltis2Semi2.setEditable(false);

                        Gols1Semi2.setEditable(true);

                        Gols2Semi2.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarFinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorSemi1.getText().equals("A definir") && !VencedorSemi2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Final.getText()) >= 0 && Integer.parseInt(Gols2Final.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Final.getText()) == Integer.parseInt(Gols2Final.getText())) {

                                Penaltis1Final.setEditable(true);

                                Penaltis2Final.setEditable(true);

                                Gols1Final.setEditable(false);

                                Gols2Final.setEditable(false);

                                if(Integer.parseInt(Penaltis1Final.getText()) >= 0 && Integer.parseInt(Penaltis2Final.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Final.getText()) > Integer.parseInt(Penaltis2Final.getText())) {

                                        VencedorFinal.setText(VencedorSemi1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Final.getText()) < Integer.parseInt(Penaltis2Final.getText())) {

                                        VencedorFinal.setText(VencedorSemi2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Final.getText()) == Integer.parseInt(Penaltis2Final.getText())) {

                                        if (Integer.parseInt(Penaltis1Final.getText()) == 0 && Integer.parseInt(Penaltis2Final.getText()) == 0) {
                                        } else {

                                            Penaltis1Final.setText("0");

                                            Penaltis2Final.setText("0");

                                            Penaltis1Final.setEditable(false);

                                            Penaltis2Final.setEditable(false);

                                            Gols1Final.setEditable(true);

                                            Gols2Final.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Final.getText()) > Integer.parseInt(Gols2Final.getText())) {

                                VencedorFinal.setText(VencedorSemi1.getText());

                            } else {

                                VencedorFinal.setText(VencedorSemi2.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Final.setText("0");

                        Penaltis2Final.setText("0");

                        Penaltis1Final.setEditable(false);

                        Penaltis2Final.setEditable(false);

                        Gols1Final.setEditable(true);

                        Gols2Final.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });
        enviarTerceira.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!PerderdorSemi1.getText().equals("A definir") && !PerderdorSemi2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Terceiro.getText()) >= 0 && Integer.parseInt(Gols2Terceiro.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Terceiro.getText()) == Integer.parseInt(Gols2Terceiro.getText())) {

                                Penaltis1Terceiro.setEditable(true);

                                Penaltis2Terceiro.setEditable(true);

                                Gols1Terceiro.setEditable(false);

                                Gols2Terceiro.setEditable(false);

                                if(Integer.parseInt(Penaltis1Terceiro.getText()) >= 0 && Integer.parseInt(Penaltis2Terceiro.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Terceiro.getText()) > Integer.parseInt(Penaltis2Terceiro.getText())) {

                                        VencedorTerceiro.setText(PerderdorSemi1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Terceiro.getText()) < Integer.parseInt(Penaltis2Terceiro.getText())) {

                                        VencedorTerceiro.setText(PerderdorSemi2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Terceiro.getText()) == Integer.parseInt(Penaltis2Terceiro.getText())) {

                                        if (Integer.parseInt(Penaltis1Terceiro.getText()) == 0 && Integer.parseInt(Penaltis2Terceiro.getText()) == 0) {
                                        } else {

                                            Penaltis1Terceiro.setText("0");

                                            Penaltis2Terceiro.setText("0");

                                            Penaltis1Terceiro.setEditable(false);

                                            Penaltis2Terceiro.setEditable(false);

                                            Gols1Terceiro.setEditable(true);

                                            Gols2Terceiro.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Terceiro.getText()) > Integer.parseInt(Gols2Terceiro.getText())) {

                                VencedorTerceiro.setText(PerderdorSemi1.getText());

                            } else {

                                VencedorTerceiro.setText(PerderdorSemi2.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Terceiro.setText("0");

                        Penaltis2Terceiro.setText("0");

                        Penaltis1Terceiro.setEditable(false);

                        Penaltis2Terceiro.setEditable(false);

                        Gols1Terceiro.setEditable(true);

                        Gols2Terceiro.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });
        Reset1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });

        /*
        enviarBotaoGrupoA.doClick();

        enviarBotaoGrupoB.doClick();

        enviarBotaoGrupoC.doClick();

        enviarBotaoGupoD.doClick();

        enviarBotaoGrupoE.doClick();

        enviarBotaoGupoF.doClick();

        enviarBotaoGrupoG.doClick();

        enviarBotaoGrupoH.doClick();
        */

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                enviarOitavas1.doClick();
                enviarOitavas2.doClick();
                enviarOitavas3.doClick();
                enviarOitavas4.doClick();
                enviarOitavas5.doClick();
                enviarOitavas6.doClick();
                enviarOitavas7.doClick();
                enviarOitavas8.doClick();
                enviarQuartas1.doClick();
                enviarQuartas2.doClick();
                enviarQuartas3.doClick();
                enviarQuartas4.doClick();
                enviarSemi1.doClick();
                enviarSemi2.doClick();
                enviarFinal.doClick();
                enviarTerceira.doClick();

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabela");

        frame.setContentPane(new Tabela().TabbedPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1920, 1080);

        frame.setVisible(true);

    }

}
