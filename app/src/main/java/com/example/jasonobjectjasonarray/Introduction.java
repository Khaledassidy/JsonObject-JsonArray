package com.example.jasonobjectjasonarray;
/*
Jason:jason 3ebra 3an foramte mesh programing language heye formate shakl m3ayn ya3ne btest5dam la na3mel sharing la data been server w l client
ya3ne bte2dar mn 5elel l jason ta3mel share la data teb3at data m3ayen test2bel data m3ayne mn server lal client l client howe l app tab3ak 2aw feeek feek teb3at data mn l user l client lal server ya3ne bekoun fe sharing lal data
jason 3ebra 3an foramte 2aw syntax mesh programing language

jason ma3neta:javascript object notation ya3ne howe ramz lal object mn java script


l object bte7tewe 3ala properties w vlaue la hay l propertie ya3ne kel object 3ana 2aw kel ke2en 3ana bel foramte taba3 jason  bekoun fe propertie w hay l properite bekoun ela value m3ayen
ya3ne bekoun 3ebra 3an key w value exmple: "name":"khaled","age":25,"isdevelpper":true

jason meshta2 men javascript

jason mesh law7da bt3mel sharing la data fe she metla esmo xml l xml bt3mel nafs fekret l jason bas fe far2 baynetoun 7a nshofo ba3den

l exetensiion taba3 l jason bekoun file .jason

w l mime type le howe no3 l data le 3al internet taba3 l jason file bekoun application\json


lesh jason?
-jason easy to use and to read
-jason mesh mortebta bas bel javascript bteshte8l ma3 kel l programing language metl java,kotlin..etc bte2dar tet3mela ma3 object jason w bt2dar ta3mel share la data  w bte2dar te5od l object le jeyelak bel jason w tet3mel ma3o 3ade bte2dar test2bel object jason w bt2dar teb3at object jason la server
-feek t7awel json object la js object javascript object
-w keef t7awel l js object la jason object
-jason object howe api support ya3ne feek eza enta btet3mela ma3 website y2demlak data m3yane 3an tare2 object json b2lbo data metl name,age,email....ect hyde btejek 3an tare2 jason object bekoun b2lbo data kola  fa fe support kbeer b5sous l api bel nesbe lal webiste l 3almeye 2aw aye wesbite metl l facebook,twitter,github 2aw aye api enta bteshte8l b team 3eyez t2dmo la nees le bteshte8l frontend bye5od menak l object le fe data w byet3emal ma3 hay data


Json vs XML

Json:
-Text Based Format metl ma taf2na howe sysntx mesh lo8a
-Light weight kteer 5afefe bel kb
-not use tag ma btest3mal tag <> mnest3mel {} praces w mn7ot b2lba key w value
-shorter kteer z8eer mesh kbeer
-can use array fena nest3mel array b2lba data
-not support commments ma fena n7ot b2lba commnets

XML:
-markup langauge heye loga mesh sysntax text
-heavier
-using tags btest3mal <tag> start tag end tag </tag>
-not short kbeer bekoun tawel
-cannot use array ma fena nest3mel array b2lba data
-support comments fena n7ot commnets l2no heye  language



what is api?
api howe keef bt2dmlak api object m2lbo data m3ayne enta btest2bel hay l baynet msln w bt3roda bshe ma7al btest5dema btezhera bshe activity


jason syntax:
-2awl sha8le lezm na3refa eno data ta3etak btenketeb jowa curly braces { "name":"khaled"}
-data betkoun ta3etak 3ebra 3an key w value
-key w l value mn3mloun sperate colon:"key":value l key 3atoul string b double quote w l data la hay l key 7asab naw3a sho badak t7otela integer,string,boolean...ect
-law 3andak data aktr mn key w vlaue btefsel baynetoun b comma "key":value,"key1":vlaue1
-one line or 2 line enta momken toktob data b one line exmple "username":"khaled","location":"lebanon" or multiple line example:  "username":"khaled",
                                                                                                                                  "location":"lebanon"
-square brackets bte7tewe 3ala array [] exmple: "skills"   : ["HTML","JAVA","XML","PYTHON"],  momken ykoun l array b2lbo object kel elemnt bel array
-curly braces bte7tewe 3ala object {}"location" : {
  "lebanon" : "baalbeck",
  "egypt"   : "skandaria",
  "KSA"     : "malaz",
  "USA"     : "california",
  "Germany" : ["one","two","three"]   momken l key bel object ykoun 3bra 3an array

 }



Data type:
-Number
-String
-Json Object {}
-Array []
-Boolean
-null



api:
Application programming interface 3bra 3an interface bet3lak data 3ala shakl jason file
sho ya3ne t5ayal eno enta b mat3am da5lt l mat3am 3ashn tekol 3atouk menue fee b2lbo anwe3 l akl le momken tekola bel mat3am fa enta btetlob akle mn aklet l mawjoude bel mat3am fa berou7o by3mlolak yeha bel matba5 w ba3den bejebolak yeha
hal enta 3reft keef l akle n3amalet 2aw da5lt l matba5? la2
hal l wajbe le enta badak yeha mana mawjoude bel menue byenfa3 ya3mlolak yeha la2 l2no mana mawjoude bel menue

nafs l ossa hayde bel zabt bel api :
ena bel 3ade 3andak mawke3 me7tej eno enta t7ot fe asme2 l mashaher w l asme2 l mashher b2lba kel l ma3lomet 3anon esmo tare5 meledo,l followers  ..etc  fa le bseer eno enta badak haw l ma3lomet fa houne by3tok access 3ala databse ta3wletoun
7a tet5ol 3ala databse 7a ta3mel select query mn database w bta3le3 l ma3lomet le badak yeha w te3roda bel application ta3elak bas hal hyda she mante2e hal mante2e eno da5lk 3al database ta3el ma barke 3mlt drop bel 8alat akkeeed 8alat fawtak w 2a3tek access 3ala databse w 8eer heek fe baynet l user

fa l api l interface le bt3mlo sherke hay btl3lak l output le enta me7tejo bas mesh le mawjoud bel databse kolo bas le enta me7tejo enta me7tej esmo w tare5o w l followers fa heda l interface b2lbo hawde l ma3lomet bas w enta feek ta3mel acces 3ala hawde l ma3lomet bas ma feek msln tetlob ma3lome metl l usernaame l2no aasln ma 7a tkoun mawjoude bel intrface fa l interface btrje3lk l data l public le btesm7lk sherke test5dema bas
ya3ne howe be2dlk heda l api bekoun bye7tewe 3ala jason formate bte2dar mn 5elelo tet3mela ma3 hay data bkel sohole to3roda 3ala l activity 2aw fragemnt le badak yeh

hala2 fe nees bt3tek data hayde website public bas fe webiste msln metl l youtube w 8ayra ma bt3tek data bekoun fe authantication ya3ne lezm ykoun eno enta 3adak ro5sa to3roud hay data 2aw la2  fe websitet ma bekoun bada

fe websitet bt3etek api fe controle 3ala data metl l youtube momken enta 3an tare2 l youtube api t3del bel channel ta3etak ye7zef vedio y3del vedio ye7zef 3enwen ya3mel l bado yeh

l apis le bel github enta btshofa bas read only ma fe controle 3ala aye she mojarad lama 7ada yektob esm sha5s fa momken jeblo b fragment jame3 l repostory ta3eto bas ya3ne enta bas feek te2raha la hay data ma bas ma feek t3del 3lyha

ya3ne l api howe mano la l databse wala server howe 3ebra 3an requst bejeblak data w l acces le ana sheyfo hala2 le howe jason formate b2lbo data m3yane le ana eb3tlk l data le enta 3eyeza bas fa eza ana 3ande data bade yeha bas mesh mawjoude momkne ana etlob mn l mat3am eno ydefo 3ala l menue fa houne yrou7o ydefoha 3ala l mneue ba3d ma yet2kdo eno ma fe meshkle ba3d heek ma ydefoha 3al mneue bseer feek trou7 3al mneue w totloba kamne bhay l 7ale enta ma 3andak access 3ala databse enta 3andak access 3ala property jdede dafolak yeha
fa l api beshel kteer 3al developer eno yeosal la she m3ayen houne 3eyzena

https://www.jsonkeeper.com/ :heda l webite la7a 2a3mel test lal json ya3ne bektob l jason berja3 ba3mel save byetl3le link heda link howe l api brou7 3ala post man ba3mel requst bredele kel hay data 2aw iza bekmoush link w b3mel seearch 3lee bel goolgle btl3le data kamen

https://jsoneditoronline.org/#left=local.gokupe&right=local.lehufo:heda link website fene et2kad mn katebet l json code




hala2 badna net3lam tare2t l converting ya3ne enta byejek jason object keef btjeeb meno data ya3ne btwlo la string 2aw iza keen integer bt7wlo la intger ya3ne btest2blo
2aw iza ejek jason array keef badak tjeeb data mneo 2aw2at btejb jason array w 3ebra 3an object kel wa7de bel array sa3eta badak t7wel mn jason array la jason object l data tes2bel feha hay l objet

heda l mawdo3 esmo parsing:

Parsing a JSON Object:String jsonString = "{ \"name\": \"John\", \"age\": 30 }"; 3ana hayde l jason 3ebra 3an jasob object badna njeeb meno name w l age w ne3roda msln bel log cat
fa badna nest3mel JSONObject heda bye5od heda bye5od string bel constructor le howe string w b7wlo la jason object l2no ne7na badna n3wel ntle3 data mn jason object
mn3ref object :JSONObject jsonObject=new JSONObject() mn3te b2ab l constructor l string  b3den byet7awal la jason object
fa hal2 la njeeb data mn hyda l object mn3mel
jsonObject.get hay l get 7asab no3 ya3ne msln name howe string fa mn2olo jsonObject.getString() w mn3te l key lal get fa brodele l vlaue taba3 hyde l key ka string
ya3ne: String x=jsonObject.getString() berodel "khaled" msln iza integer mn2olo jasonobject.getInt("age") berode l age ka integr

String jsonString = "{ \"name\": \"khaled\", \"age\": 22 }";
        JSONObject jsonObject;

        {
            try {
                jsonObject = new JSONObject(jsonString);
                String name=jsonObject.getString("name");
                int age=jsonObject.getInt("age");
                Log.d("json",name);
                Log.d("json",age+"");

            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }


parsing json array:
3ande string String jsonArrayString = "[{ \"name\": \"John\", \"age\": 30 }, { \"name\": \"Jane\", \"age\": 25 }]";

heda l string bade 7awlo la json array 3ashn bade et3emal ma3 jason array
fa 3ande class esmo JsonArray fa ba3mel object JSONArray jsonarray=new JSONArray() heda l object ba3te string le 3ande fa be7wlo la array bekoun fe b2albo 2 object mn json metl ma 3ande bel string le m3rfo
fa ba3d ma 3nade array of object json hala2 bade jeeb l json object mn hay l array keef
ba3mel for loop 3ala l json array la 3end length taba3 l jason array w jowa loop b2olo lal array of jason
jsonArray.getJSONObject(i) fa 7a yrdele jason object kel mara
ba3den bjeeb l values b2lb heda l object b2olo 7asab l datatybe la n2ol string l name keen jsonobject.getString("name) berdel l name le b2lb l json object w kamen b2olo age...ect
bsayvoun b varble w ba3den betb3oun bel logcat


parsing nested json:
ya3ne 3ana json object b2lbo key w value ba3den b2lbo key w heda l jey 3ebra 3an object fa sar 3ana object b2lb object
fa bhay l 7ale mnjeeb l object kemel ba3den mnjeeb l object le b2lb l object mn 5elel l key
w mn heda l object bjeeb l values
String jsonString = "{ \"name\": \"John\", \"address\": { \"city\": \"New York\", \"zip\": \"10001\" } }";
try {
    JSONObject jsonObject = new JSONObject(jsonString);
    String name = jsonObject.getString("name");
    JSONObject address = jsonObject.getJSONObject("address");
    String city = address.getString("city");
    String zip = address.getString("zip");
} catch (JSONException e) {
    e.printStackTrace();
}



3ana library esma Gson  convert Java objects to JSON and JSON strings back into Java objects,
ya3ne iza 3ana opject mno3 person 3ebra 3an name w age 3mlt object 3atyto name khaled w gae 22 bade 7awlo heda l object l person la jason object hay l 3mlye esma serilization
keef btseer mnest3mel hayde library la7ala bt3mel map la7ala mn java object la jason object w vic verca 7ata iza keen complex json object w nested
2awl she mnest3mel library mn3mla implemnet bel gradle implementation 'com.google.code.gson:gson:2.8.9'
// Create a Gson instance
        Gson gson = new Gson();

        // Create a Person object
        Person person = new Person("John", 30);

        // Convert the Person object to JSON
        String jsonstring = gson.toJson(person);
        // Output: {"name":"John","age":30}
        Log.d("GSon",jsonString);



tyeb hala2 l 3aks iza 3ande json string ya3ne string bas b2lbo foramte mn no3 json  bade 7awlo la object java hay l 3mlye esma deserilication
keen iza bade 2a3ml hay l 3mlye bade 7awel l string json la object erja3 jeeb meno l data erja3 2a3ml object mn prson w 3abe data feh la heda l object ama hal2
3ande string json
bekfe bas 3ref object mn person person =gson.fromJson(jsonstring, Person.class);
bhya tare2a b7wel l string la object java w la no3 person le 2no enta 3atyto class howe person w b3be data le b2lb l vlaue taba3 l key b2lb object l person ya3ne hala2 iza betba3 data le bel object l person 7a ytl3le data le bel key  ya3ne sar b2lb heda l object l person le 3ande b2lbo name khaled  w age 22


tyeb ne7na iza 3ana array of json w badna n7wlo la list of object mn no3 person bas l meshkle le 7a twejhne eno bas 7ot l sting json l paramter tene howe tybe bado type taba3 hyde l string json la ye2dar y7wela fa houn keef bade 7aded type
3ande interface esmo Type heda 3ebra 3an interface fe b2lbo kel tybe taba3 java array,list..ect heye bt7wel no3 la generic type
bas l meshkle tenye eno bel run bas yseer 3ana l inforamtion l generic type byen3ama erase fa ma 7a ye2dar l GSoN ya3ref type fa 3ashn 7ola la hay l meshkle best3mel ya3ne heye hay meshkle eno by3mel earase la type naw3 l generic bel compilation time ya3ne List heye 3ebra 3an generic type bas yseer compilation java by3ref eno list bas type byen3mlo earase la 7el hal l meshkle w type ma yrou7 bedal list mno3 object w list mno3 object bte5od aye no3 object person 2aw aye bas type taba3 list b7ad zeta btseer object 3atoul w hay btest2bel aye no3 ne7na houn behmna type l2no bado ya3ef GSON hso howe type
TypeToken class bel GSON heda by3mel capture bsayev l inforamtion ta3et l generic type ya3ne b5le eno type ta3elo Person eno howe mno3 kaza w ma bt5leha trou7 w bnfas l wa2t heda fene 2a3ml retirive la type sho bade 2a3ml
Type type=new TypeToken<List<Person>>() {} bt3mel anynmous subclass mno3 typetoken b2olo hayde heye l ma3lomet le bade sayevsa mno3 Person  ma trou7 le heye List<Person> bhay l 7ale 7a ysayev l ma3lomet le 5asa bel geniric type list<Person> ba3den bade jeeb type no3 taba3 heda generc type fa b2olo .gettype()



hala2 keef fena na3mel ne7na jason object 2aw jason array w n7ot b2lba data la hayde json object w l array

mn3mel json object :JSONObjet jsonobject=new JSONObjet()
ba3den bseer b3mel add la key w value ya3ne
jsonobject.put("name","khaled")
jsonobject.put("age",30)

tyeb la n2ol 3ana 3 jsno object w bade 7ot hay data b array of jason object
ArrayJSONObject array=new ArrayJSONobject();
 ba3mel array.put(jsonobject1)
 ba3mel array.put(jsonobject2)
 ba3mel array.put(jsonobject3)
 heeek bseer 3ande array of json obejct b2lba 3 json object










*/




public class Introduction {

}
