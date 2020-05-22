/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawgif;

import AnalizadorPnt.lexicoPnt;
import AnalizadorPnt.parserPnt;
import java.awt.List;
//import static AnalizadorPnt.parserPnt.Semanticos;

import java.io.BufferedReader;
import java.io.StringReader;

import java.util.ArrayList;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;

/**
 *
 * @author jhonny
 */
public class DrawGif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //generarCompilador();
        probar();


        /*String datos = "SanMarcos|Quetzaltengo|60|128|50|250|44\n"
                + "Quetzaltengo|SanMarcos|60|128|50|250|44\n"
                + "Quetzaltengo|Salola|60|128|50|250|44\n"
                + "Solola|Chimaltenago|60|128|50|250|44\n"
                + "Chimaltenago|Guatemala|60|128|50|250|44\n"
                + "Quetzaltengo|Retalhuleu|60|128|50|250|44\n"
                + "Retalhuleu|Suchitepequez|60|128|50|250|44\n"
                + "Suchitepequez|Guatemala|70|250|60|2500|70\n"
                + "ElProgreso|SantaCatarinaPinula|62|456|50|524|48\n"
                + "Sacatepéquez|SanJoséPinula|32|453|51|634|54\n"
                + "Chimaltenango|SanJosédelGolfo|42|759|42|123|64\n"
                + "Escuintla|Palencia|85|495|63|456|78\n"
                + "SantaRosa|Chinautla|24|425|47|321|42\n"
                + "Sololá|SanPedroAyampuc|24|123|46|147|43\n"
                + "Totonicapán|Mixco|24|62|55|159|51\n"
                + "Quetzaltenango|SanPedroSacatepéquez|24|50|62|555|55\n"
                + "Suchitepéquez|SanJuanSacatepéquez|24|51|32|456|62\n"
                + "Retalhuleu|SanRaymundo|24|42|42|453|32\n"
                + "SanMarcos|Chuarrancho|24|63|85|759|42\n"
                + "Huehuetenango|Fraijanes|24|47|24|495|85\n"
                + "Quiché|Amatitlán|24|46|24|425|24\n"
                + "BajaVerapaz|VillaNueva|24|555|24|123|24\n"
                + "AltaVerapaz|VillaCanales|24|456|24|62|24\n"
                + "Petén|Petapa|24|453|24|50|24\n"
                + "Izabal|Guatemalamunicipionodeclarado|42|759|24|51|24\n"
                + "Zacapa|Guastatoya|42|495|24|42|24\n"
                + "Chiquimula|Morazán|42|425|24|63|24\n"
                + "Jalapa|SanAgustínAcasaguastlán|42|123|24|47|24\n"
                + "Jutiapa|SanCristóbalAcasaguastlán|42|62|24|46|24\n"
                + "Guatemala|ElJícaro|42|50|24|555|24\n"
                + "ElProgreso|Sansare|42|51|24|456|24\n"
                + "Sacatepéquez|Sanarate|42|42|42|453|24\n"
                + "Chimaltenango|SanAntoniolaPaz|55|63|42|759|42\n"
                + "Escuintla|ElProgresomunicipionodeclarado|62|47|42|495|42\n"
                + "SantaRosa|AntiguaGuatemala|32|46|42|425|42\n"
                + "Sololá|Jocotenango|42|555|42|123|42\n"
                + "Totonicapán|Pastores|85|456|42|62|42\n"
                + "Quetzaltenango|Sumpango|24|453|42|50|42\n"
                + "Suchitepéquez|SantoDomingoXenacoj|24|759|42|51|42\n"
                + "Retalhuleu|SantiagoSacatepéquez|24|495|55|42|42\n"
                + "SanMarcos|SanBartoloméMilpasAltas|24|425|62|63|55\n"
                + "Huehuetenango|SanLucasSacatepéquez|24|123|32|47|62\n"
                + "Quiché|SantaLucíaMilpasAltas|24|62|42|46|32\n"
                + "BajaVerapaz|MagdalenaMilpasAltas|24|50|85|555|42\n"
                + "AltaVerapaz|SantaMaríadeJesús|24|51|24|456|85\n"
                + "Petén|CiudadVieja|24|42|24|453|24\n"
                + "Izabal|SanMiguelDueñas|24|63|24|759|24\n"
                + "Zacapa|SanJuanAlotenango|24|47|24|495|24\n"
                + "Chiquimula|SanAntonioAguasCalientes|24|46|24|425|24\n"
                + "Jalapa|SantaCatarinaBarahona|42|555|24|123|24\n"
                + "Jutiapa|Sacatepéquezmunicipionodeclarado|42|456|24|62|24\n"
                + "Guatemala|Chimaltenango|42|453|24|50|24\n"
                + "ElProgreso|SanJoséPoaquil|42|759|24|51|24\n"
                + "Sacatepéquez|SanMartínJilotepeque|42|495|24|42|24\n"
                + "Chimaltenango|Comalapa|42|425|24|63|24\n"
                + "Escuintla|SantaApolonia|42|123|24|47|24\n"
                + "SantaRosa|TecpánGuatemala|42|62|42|46|24\n"
                + "Sololá|Patzún|55|50|42|555|42\n"
                + "Totonicapán|SanMiguelPochuta|62|51|42|456|42\n"
                + "Quetzaltenango|Patzicía|32|42|42|453|42\n"
                + "Suchitepéquez|SantaCruzBalanyá|42|63|42|759|42\n"
                + "Retalhuleu|Acatenango|85|47|42|495|42\n"
                + "SanMarcos|Yepocapa|24|46|42|425|42\n"
                + "Huehuetenango|SanAndrésItzapa|24|555|42|123|42\n"
                + "Quiché|Parramos|24|456|55|62|42\n"
                + "BajaVerapaz|Zaragoza|24|453|62|50|55\n"
                + "AltaVerapaz|ElTejar|24|759|32|51|62\n"
                + "Petén|Chimaltenangomunicipionodeclarado|24|495|42|42|32\n"
                + "Izabal|Escuintla|24|425|85|63|42\n"
                + "Zacapa|SantaLucíaCotzumalguapa|24|123|24|47|85\n"
                + "Chiquimula|LaDemocracia|24|555|24|46|24\n"
                + "Jalapa|Siquinalá|24|456|24|555|24\n"
                + "Jutiapa|Masagua|24|453|24|456|24\n"
                + "Guatemala|Tiquisate|24|759|24|453|24\n"
                + "ElProgreso|LaGomera|42|495|24|759|24\n"
                + "Sacatepéquez|Guanagazapa|42|425|24|495|24\n"
                + "Chimaltenango|SanJosé|42|123|24|425|24\n"
                + "Escuintla|Iztapa|42|62|24|123|24\n"
                + "SantaRosa|Palín|42|50|24|555|24\n"
                + "Sololá|SanVicentePacaya|42|51|24|456|24\n"
                + "Totonicapán|NuevaConcepción|42|42|24|453|24\n"
                + "Quetzaltenango|Sipacate|42|63|42|759|24\n"
                + "Suchitepéquez|Escuintlamunicipionodeclarado|55|47|42|495|42\n"
                + "Retalhuleu|Cuilapa|62|46|42|425|42\n"
                + "SanMarcos|Barberena|32|555|42|123|42\n"
                + "Huehuetenango|SantaRosadeLima|42|456|42|62|42\n"
                + "Quiché|Casillas|85|453|42|50|42\n"
                + "BajaVerapaz|SanRafaellasFlores|24|759|42|51|42\n"
                + "AltaVerapaz|Oratorio|24|495|42|42|42\n"
                + "Petén|SanJuanTecuaco|24|425|55|63|42\n"
                + "Izabal|Chiquimulilla|24|123|62|47|55\n"
                + "Zacapa|Taxisco|24|62|32|46|62\n"
                + "Chiquimula|SantaMaríaIxhuatán|24|50|42|555|32\n"
                + "Jalapa|Guazacapán|24|51|85|456|42\n"
                + "Jutiapa|SantaCruzNaranjo|24|42|24|453|85\n"
                + "Guatemala|PuebloNuevoViñas|24|63|24|759|24\n"
                + "ElProgreso|NuevaSantaRosa|24|47|24|495|24\n"
                + "Sacatepéquez|SantaRosamunicipionodeclarado|24|46|24|425|24\n"
                + "Chimaltenango|Sololá|24|555|24|123|24\n"
                + "Escuintla|SanJoséChacayá|42|456|24|62|24\n"
                + "SantaRosa|SantaMaríaVisitación|42|453|24|50|24\n"
                + "Sololá|SantaLucíaUtatlán|42|759|24|51|24\n"
                + "Totonicapán|Nahualá|42|495|24|42|24\n"
                + "Quetzaltenango|SantaCatarinaIxtahuacán|42|425|24|63|24\n"
                + "Suchitepéquez|SantaClaralaLaguna|42|123|24|47|24\n"
                + "Retalhuleu|Concepción|42|555|24|46|24\n"
                + "SanMarcos|SanAndrésSemetabaj|42|456|42|555|24\n"
                + "Huehuetenango|Panajachel|55|453|42|456|42\n"
                + "Quiché|SantaCatarinaPalopó|62|759|42|453|42\n"
                + "BajaVerapaz|SanAntonioPalopó|32|495|42|759|42\n"
                + "AltaVerapaz|SanLucasTolimán|42|425|42|495|42\n"
                + "Petén|SantaCruzlaLaguna|85|123|42|425|42\n"
                + "Izabal|SanPablolaLaguna|24|62|42|123|42\n"
                + "Zacapa|SanMarcoslaLaguna|24|50|42|555|42\n"
                + "Chiquimula|SanJuanlaLaguna|24|51|55|456|42\n"
                + "Jalapa|SanPedrolaLaguna|24|42|62|453|55\n"
                + "Jutiapa|SantiagoAtitlán|24|63|32|759|62\n"
                + "Guatemala|Sololámunicipionodeclarado|24|47|42|495|32\n"
                + "ElProgreso|Totonicapán|24|46|85|425|42\n"
                + "Sacatepéquez|SanCristóbalTotonicapán|24|555|24|123|85\n"
                + "Chimaltenango|SanFranciscoelAlto|24|456|24|62|24\n"
                + "Escuintla|SanAndrésXecul|24|453|24|50|24\n"
                + "SantaRosa|Momostenango|24|759|24|51|24\n"
                + "Sololá|SantaMaríaChiquimula|24|495|24|42|24\n"
                + "Totonicapán|SantaLucíalaReforma|42|425|24|63|24\n"
                + "Quetzaltenango|SanBartoloAguasCalientes|42|123|24|47|24\n"
                + "Suchitepéquez|Totonicapánmunicipionodeclarado|42|62|24|46|24\n"
                + "Retalhuleu|Quetzaltenango|42|50|24|555|24\n"
                + "SanMarcos|Salcajá|42|51|24|456|24\n"
                + "Huehuetenango|Olintepeque|42|42|24|453|24\n"
                + "Quiché|SanCarlosSija|42|63|24|759|24\n"
                + "BajaVerapaz|Sibilia|42|47|42|495|24\n"
                + "AltaVerapaz|Cabricán|55|46|42|425|42\n"
                + "Petén|Cajolá|62|555|42|123|42\n"
                + "Izabal|SanMiguelSiguilá|32|456|42|62|42\n"
                + "Zacapa|SanJuanOstuncalco|42|453|42|50|42\n"
                + "Chiquimula|SanMateo|85|759|42|51|42\n"
                + "Jalapa|ConcepciónChiquirichapa|24|495|42|42|42\n"
                + "Jutiapa|SanMartínSacatepéquez|24|425|42|63|42\n"
                + "Guatemala|Almolonga|24|123|55|47|42\n"
                + "ElProgreso|Cantel|24|62|62|46|55\n"
                + "Sacatepéquez|Huitán|24|50|32|555|62\n"
                + "Chimaltenango|Zunil|24|51|42|456|32\n"
                + "Escuintla|Colomba|24|42|85|453|42\n"
                + "SantaRosa|SanFranciscolaUnión|24|63|24|759|85\n"
                + "Sololá|ElPalmar|24|47|24|495|24\n"
                + "Totonicapán|Coatepeque|24|46|24|425|24\n"
                + "Quetzaltenango|Génova|24|555|24|123|24\n"
                + "Suchitepéquez|FloresCostaCuca|24|456|24|62|24\n"
                + "Retalhuleu|LaEsperanza|42|453|24|50|24\n"
                + "SanMarcos|PalestinadelosAltos|42|759|24|51|24\n"
                + "Huehuetenango|Quetzaltenangomunicipionodeclarado|42|495|24|42|24\n"
                + "Quiché|Mazatenango|42|425|24|63|24\n"
                + "BajaVerapaz|Cuyotenango|42|123|24|47|24\n"
                + "AltaVerapaz|SanFranciscoZapotitlán|42|62|24|46|24\n"
                + "Petén|SanBernardino|42|50|24|555|24\n"
                + "Izabal|SanJoséelÍdolo|42|51|42|456|24\n"
                + "Zacapa|SantoDomingoSuchitepéquez|55|42|42|453|42\n"
                + "Chiquimula|SanLorenzo|62|63|42|759|42\n"
                + "Jalapa|Samayac|32|47|42|495|42\n"
                + "Jutiapa|SanPabloJocopilas|42|46|42|425|42\n"
                + "Guatemala|SanAntonioSuchitepéquez|85|555|42|123|42\n"
                + "ElProgreso|SanMiguelPanán|24|456|42|62|42\n"
                + "Sacatepéquez|SanGabriel|24|453|42|50|42\n"
                + "Chimaltenango|Chicacao|24|759|55|51|42\n"
                + "Escuintla|Patulul|24|495|62|42|55\n"
                + "SantaRosa|SantaBárbara|24|425|32|63|62\n"
                + "Sololá|SanJuanBautista|24|123|42|47|32\n"
                + "Totonicapán|SantoTomaslaUnión|24|555|85|46|42\n"
                + "Quetzaltenango|Zunilito|24|456|24|555|85\n"
                + "Suchitepéquez|PuebloNuevo|24|453|24|456|24\n"
                + "Retalhuleu|RíoBravo|24|759|24|453|24\n"
                + "SanMarcos|SanJoséLaMáquina|24|495|24|759|24\n"
                + "Huehuetenango|Suchitepéquezmunicipionodeclarado|24|425|24|495|24\n"
                + "Quiché|Retalhuleu|42|123|24|425|24\n"
                + "BajaVerapaz|SanSebastián|42|62|24|123|24\n"
                + "AltaVerapaz|SantaCruzMuluá|42|50|24|555|24\n"
                + "Petén|SanMartínZapotitlán|42|51|24|456|24\n"
                + "Izabal|SanFelipe|42|42|24|453|24\n"
                + "Zacapa|SanAndrésVillaSeca|42|63|24|759|24\n"
                + "Chiquimula|Champerico|42|47|24|495|24\n"
                + "Jalapa|NuevoSanCarlos|42|46|42|425|24\n"
                + "Jutiapa|ElAsintal|55|555|42|123|42\n"
                + "Guatemala|Retalhuleumunicipionodeclarado|62|456|42|62|42\n"
                + "ElProgreso|SanMarcos|32|453|42|50|42\n"
                + "Sacatepéquez|SanPedroSacatepéquez|42|759|42|51|42\n"
                + "Chimaltenango|SanAntonioSacatepéquez|85|495|42|42|42\n"
                + "Escuintla|Comitancillo|24|425|42|63|42\n"
                + "SantaRosa|SanMiguelIxtahuacán|24|123|42|47|42\n"
                + "Sololá|ConcepciónTutuapa|24|62|55|46|42\n"
                + "Totonicapán|Tacaná|24|50|62|555|55\n"
                + "Quetzaltenango|Sibinal|24|51|32|456|62\n"
                + "Suchitepéquez|Tajumulco|24|42|42|453|32\n"
                + "Retalhuleu|Tejutla|24|63|85|759|42\n"
                + "SanMarcos|SanRafaelPiedelaCuesta|24|47|24|495|85\n"
                + "Huehuetenango|NuevoProgreso|24|46|24|425|24\n"
                + "Quiché|ElTumbador|24|555|24|123|24\n"
                + "BajaVerapaz|SanJoséelRodeo|24|456|24|62|24\n"
                + "AltaVerapaz|Malacatán|24|453|24|50|24\n"
                + "Petén|Catarina|42|759|24|51|24\n"
                + "Izabal|Ayutla|42|495|24|42|24\n"
                + "Zacapa|Ocós|42|425|24|63|24\n"
                + "Chiquimula|SanPablo|42|123|24|47|24\n"
                + "Jalapa|ElQuetzal|42|555|24|46|24\n"
                + "Jutiapa|LaReforma|42|456|24|555|24\n"
                + "Guatemala|Pajapita|42|453|24|456|24\n"
                + "ElProgreso|Ixchiguán|42|759|42|453|24\n"
                + "Sacatepéquez|SanJoséOjetenam|55|495|42|759|42\n"
                + "Chimaltenango|SanCristóbalCucho|62|425|42|495|42\n"
                + "Escuintla|Sipacapa|32|123|42|425|42\n"
                + "SantaRosa|EsquipulasPaloGordo|42|62|42|123|42\n"
                + "Sololá|RíoBlanco|85|50|42|555|42\n"
                + "Totonicapán|SanLorenzo|24|51|42|456|42\n"
                + "Quetzaltenango|LaBlanca|24|42|42|453|42\n"
                + "Suchitepéquez|SanMarcosmunicipionodeclarado|24|63|55|759|42\n"
                + "Retalhuleu|Huehuetenango|24|47|62|495|55\n"
                + "SanMarcos|Chiantla|24|46|32|425|62\n"
                + "Huehuetenango|Malacatancito|24|555|42|123|32\n"
                + "Quiché|Cuilco|24|456|85|62|42\n"
                + "BajaVerapaz|Nentón|24|453|24|50|85\n"
                + "AltaVerapaz|SanPedroNecta|24|759|24|51|24\n"
                + "Petén|Jacaltenango|24|495|24|42|24\n"
                + "Izabal|SanPedroSoloma|24|425|24|63|24\n"
                + "Zacapa|SanIldefonsoIxtahuacán|24|123|24|47|24\n"
                + "Chiquimula|SantaBárbara|42|62|24|46|24\n"
                + "Jalapa|LaLibertad|42|50|24|555|24\n"
                + "Jutiapa|LaDemocracia|42|51|24|456|24\n"
                + "Guatemala|SanMiguelAcatán|42|42|24|453|24\n"
                + "ElProgreso|SanRafaelLaIndependencia|42|63|24|759|24\n"
                + "Sacatepéquez|TodosSantosCuchumatán|42|47|24|495|24\n"
                + "Chimaltenango|SanJuanAtitán|42|46|24|425|24\n"
                + "Escuintla|SantaEulalia|42|555|42|123|24\n"
                + "SantaRosa|SanMateoIxtatán|55|456|42|62|42\n"
                + "Sololá|Colotenango|62|453|42|50|42\n"
                + "Totonicapán|SanSebastiánHuehuetenango|32|759|42|51|42\n"
                + "Quetzaltenango|Tectitán|42|495|42|42|42\n"
                + "Suchitepéquez|ConcepciónHuista|85|425|42|63|42\n"
                + "Retalhuleu|SanJuanIxcoy|24|123|42|47|42\n"
                + "SanMarcos|SanAntonioHuista|24|62|42|46|42\n"
                + "Huehuetenango|SanSebastiánCoatán|24|50|55|555|42\n"
                + "Quiché|Barrillas|24|51|62|456|55\n"
                + "BajaVerapaz|Aguacatán|24|42|32|453|62\n"
                + "AltaVerapaz|SanRafaelPetzal|24|63|42|759|32\n"
                + "Petén|SanGasparIxchil|24|47|85|495|42\n"
                + "Izabal|SantiagoChimaltenango|24|46|24|425|85\n"
                + "Zacapa|SantaAnaHuista|24|555|24|123|24\n"
                + "Chiquimula|UniónCantinil|24|456|24|62|24\n"
                + "Jalapa|Petatán|24|453|24|50|24\n"
                + "Jutiapa|Huehuetenangomunicipionodeclarado|24|759|24|51|24\n"
                + "Guatemala|SantaCruzdelQuiché|42|495|24|42|24\n"
                + "ElProgreso|Chiché|42|425|24|63|24\n"
                + "Sacatepéquez|Chinique|42|123|24|47|24\n"
                + "Chimaltenango|Zacualpa|42|62|24|46|24\n"
                + "Escuintla|Chajul|42|50|24|555|24\n"
                + "SantaRosa|Chichicastenango|42|51|24|456|24\n"
                + "Sololá|Patzité|42|42|24|453|24\n"
                + "Totonicapán|SanAntonioIlotenango|42|63|42|759|24\n"
                + "Quetzaltenango|SanPedroJocopilas|55|47|42|495|42\n"
                + "Suchitepéquez|Cunén|62|46|42|425|42\n"
                + "Retalhuleu|SanJuanCotzal|32|555|42|123|42\n"
                + "SanMarcos|Joyabaj|42|456|42|62|42\n"
                + "Huehuetenango|SantaMaríaNebaj|85|453|42|50|42\n"
                + "Quiché|SanAndrésSajcabajá|24|759|42|51|42\n"
                + "BajaVerapaz|SanMiguelUspantán|24|495|42|42|42\n"
                + "AltaVerapaz|Sacapulas|24|425|55|63|42\n"
                + "Petén|SanBartoloméJocotenango|24|123|62|47|55\n"
                + "Izabal|Canillá|24|555|32|46|62\n"
                + "Zacapa|Chicamán|24|456|42|555|32\n"
                + "Chiquimula|Ixcán|24|453|85|456|42\n"
                + "Jalapa|Pachalum|24|759|24|453|85\n"
                + "Jutiapa|Quichémunicipionodeclarado|24|495|24|759|24\n"
                + "Guatemala|Salamá|24|425|24|495|24\n"
                + "ElProgreso|SanMiguelChicaj|24|123|24|425|24\n"
                + "Sacatepéquez|Rabinal|24|62|24|123|24\n"
                + "Chimaltenango|Cubulco|42|50|24|555|24\n"
                + "Escuintla|Granados|42|51|24|456|24\n"
                + "SantaRosa|ElChol|42|42|24|453|24\n"
                + "Sololá|SanJerónimo|42|63|24|759|24\n"
                + "Totonicapán|Purulhá|42|47|24|495|24\n"
                + "Quetzaltenango|BajaVerapazmunicipionodeclarado|42|46|24|425|24\n"
                + "Suchitepéquez|Cobán|42|555|24|123|24\n"
                + "Retalhuleu|SantaCruzVerapaz|42|456|42|62|24\n"
                + "SanMarcos|SanCristóbalVerapaz|55|453|42|50|42\n"
                + "Huehuetenango|Tactic|62|759|42|51|42\n"
                + "Quiché|Tamahú|32|495|42|42|42\n"
                + "BajaVerapaz|Tucurú|42|425|42|63|42\n"
                + "AltaVerapaz|Panzós|85|123|42|47|42\n"
                + "Petén|Senahú|24|62|42|46|42\n"
                + "Izabal|SanPedroCarchá|24|50|42|555|42\n"
                + "Zacapa|SanJuanChamelco|24|51|55|456|42\n"
                + "Chiquimula|Lanquín|24|42|62|453|55\n"
                + "Jalapa|Cahabón|24|63|32|759|62\n"
                + "Jutiapa|Chisec|24|47|42|495|32\n"
                + "Guatemala|Chahal|24|46|85|425|42\n"
                + "ElProgreso|FrayBartolomédelasCasas|24|555|24|123|85\n"
                + "Sacatepéquez|SantaCatarinaLaTinta|24|456|24|62|24\n"
                + "Chimaltenango|Raxruhá|24|453|24|50|24\n"
                + "Escuintla|AltaVerapazmunicipionodeclarado|24|759|24|51|24\n"
                + "SantaRosa|Flores|24|495|24|42|24\n"
                + "Sololá|SanJosé|42|425|24|63|24\n"
                + "Totonicapán|SanBenito|42|123|24|47|24\n"
                + "Quetzaltenango|SanAndrés|42|555|24|46|24\n"
                + "Suchitepéquez|LaLibertad|42|456|24|555|24\n"
                + "Retalhuleu|SanFrancisco|42|453|24|456|24\n"
                + "SanMarcos|SantaAna|42|759|24|453|24\n"
                + "Huehuetenango|Dolores|42|495|24|759|24\n"
                + "Quiché|SanLuis|42|425|42|495|24\n"
                + "BajaVerapaz|Sayaxché|32|123|42|425|42\n"
                + "AltaVerapaz|MelchordeMencos|42|62|42|123|42\n"
                + "Petén|Poptún|85|50|42|555|42\n"
                + "Izabal|LasCruces|24|51|42|456|42\n"
                + "Zacapa|ElChal|24|42|42|453|42\n"
                + "Chiquimula|Peténmunicipionodeclarado|24|63|42|759|42\n"
                + "Jalapa|PuertoBarrios|24|47|42|495|42\n"
                + "Jutiapa|Livingston|24|46|32|425|42\n"
                + "Guatemala|ElEstor|24|555|42|123|32\n"
                + "ElProgreso|Morales|24|456|85|62|42\n"
                + "Sacatepéquez|LosAmates|24|453|24|50|85\n"
                + "Chimaltenango|Izabalmunicipionodeclarado|24|759|24|51|24\n"
                + "Escuintla|Zacapa|24|495|24|42|24\n"
                + "SantaRosa|Estanzuela|24|425|24|63|24\n"
                + "Sololá|RíoHondo|24|123|24|47|24\n"
                + "Totonicapán|Gualán|42|62|24|46|24\n"
                + "Quetzaltenango|Teculután|42|50|24|555|24\n"
                + "Suchitepéquez|Usumatlán|42|51|24|456|24\n"
                + "Retalhuleu|Cabañas|42|42|24|453|24\n"
                + "SanMarcos|SanDiego|42|63|24|759|24\n"
                + "Huehuetenango|LaUnión|42|47|24|495|24\n"
                + "Quiché|Huité|42|46|24|425|24\n"
                + "BajaVerapaz|SanJorge|42|555|42|123|24\n"
                + "AltaVerapaz|Zacapamunicipionodeclarado||456|42|62|42\n"
                + "Petén|Chiquimula|55|453|42|50|42\n"
                + "Izabal|SanJosélaArada|62|759|42|51|42\n"
                + "Zacapa|SanJuanErmita|32|495|42|42|42\n"
                + "Chiquimula|Jocotán|42|425|42|63|42\n"
                + "Jalapa|Camotán|85|123|42|47|42\n"
                + "Jutiapa|Olopa|24|62|42|46|42\n"
                + "Guatemala|Esquipulas|24|50||555|42\n"
                + "ElProgreso|ConcepciónlasMinas|24|51|55|456|\n"
                + "Sacatepéquez|Quezaltepeque|24|42|62|453|55\n"
                + "Chimaltenango|SanJacinto|24|63|32|759|62\n"
                + "Escuintla|Ipala|24|47|42|495|32\n"
                + "SantaRosa|Chiquimulamunicipionodeclarado|24|46|85|425|42\n"
                + "Sololá|Jalapa|24|555|24|123|85\n"
                + "Totonicapán|SanPedroPinula|24|456|24|62|24\n"
                + "Quetzaltenango|SanLuisJilotepeque|24|453|24|50|24\n"
                + "Suchitepéquez|SanManuelChaparrón|24|759|24|51|24\n"
                + "Retalhuleu|SanCarlosAlzatate|24|495|24|42|24\n"
                + "SanMarcos|Monjas|42|425|24|63|24\n"
                + "Huehuetenango|Mataquescuintla|42|123|24|47|24\n"
                + "Quiché|Jalapamunicipionodeclarado|42|62|24|46|24\n"
                + "BajaVerapaz|Jutiapa|42|50|24|555|24\n"
                + "AltaVerapaz|ElProgreso|42|51|24|456|24\n"
                + "Petén|SantaCatarinaMita|42|42|24|453|24\n"
                + "Izabal|AguaBlanca|42|63|24|759|24\n"
                + "Zacapa|AsunciónMita|42|47|42|495|24\n"
                + "Chiquimula|Yupiltepeque|55|46|42|425|42\n"
                + "Jalapa|Atescatempa|62|555|42|123|42\n"
                + "Jutiapa|Jerez|32|456|42|62|42\n"
                + "Guatemala|ElAdelanto|42|453|42|50|42\n"
                + "ElProgreso|Zapotitlán|85|759|42|51|42\n"
                + "Sacatepéquez|Comapa|24|495|42|42|42\n"
                + "Chimaltenango|Jalpatagua|24|425|42|63|42\n"
                + "Escuintla|Conguaco|24|123|55|47|42\n"
                + "SantaRosa|Moyuta|24|555|62|46|55\n"
                + "Sololá|Pasaco|24|456|32|555|62\n"
                + "Totonicapán|SanJoséAcatempa|24|453|42|456|32\n"
                + "Quetzaltenango|Quesada|24|759|85|453|42";

        String array[] = datos.split("\n");
        String next = "";
        int contador = 0;
        for (String array1 : array) {
           
            String tmp = "<";
           
                String vector[] = array1.split("");
                for (String string : vector) {
                    if(contador==6)break;
                    if (string.equals("|")) {
                        if(contador==5){
                        tmp+=">";
                        }else{
                        tmp += ">|<";
                        }
                        contador++;
                    } else {
                        tmp += string;
                    }
                    
                }
                
                next += tmp+"\n";
                contador=0;
            
           
            
            

        }
        System.out.println(next);*/
    }

    private static void generarCompilador() {

        try {
            String ruta = "src/AnalizadorPnt/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = {ruta + "lexicoPnt.jflex", "-d", ruta};
            //jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parserPnt", ruta + "parserPnt.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   

    private static void probar() {
        //generarCompilador();
       
        String contenido = "VARS [\n"
                + "int x=2,j=x+2;"
                + "boolean k=true;"
                + "String f=\"f\";"
                + "String l=f+x;\n"
                + "]"
                + "INSTRUCCIONES(otroLienzo) ["
                + "\n"
                + "if(2==3){"
                + "PINTAR(kkk,\"f\",1,2);\n"
                + "}"
                + "]";
        
       
        lexicoPnt scan = new lexicoPnt(new BufferedReader(new StringReader(contenido)));
        String dato = (true && true && true) + " ";
        parserPnt parser = new parserPnt(scan);
        parser.tablaForInt = new ArrayList<>();
        parser.Semanticos = new ArrayList<>();

        try {
            parser.parse();
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "s");
        }

        for (int i = 0; i < parserPnt.Semanticos.size(); i++) {
            System.out.println(parserPnt.Semanticos.get(i).getSolucion());

        }
    }

}
