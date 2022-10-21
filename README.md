# VodafoneMobileTestAutomation

<hr/>
<img src="https://github.com/ErvaYucedal/VodafoneMobileTestAutomation/blob/main/63012e0b4cf51-384x384.png" width="60" height="60">
### Yanımda Uygulaması <br/>

Bana verilen taskte belirtildiği üzere; 
<br/>Vodafone Yanımda uygulamasına müşteri girişi yapmak için kullanıcı bilgilerini girdim ve telefonuma 
gelen şifreyi parse ederek giriş yaptım. Her şey Yanımda menüsüne girerek Günün
Tekliflerine tıkladım. Ürün filtreleme yaparak filtrelenen ürünler arasından en düşük ücretli ürünü favorilere,
en yüksek ücretli ürünü sepetime ekledim. 
<br/>
<br/>
Vodafone Yanımda mobil uygulamasının testlerini gerçekleştirdiğim bu projede önce manuel testi gerçekleştirdikten sonra
mobil otomasyon testi için Java kodlama dilini ve  Cucumber BDD framework ile çalıştım. Cucumber Framework'unde
OOP kopsepte uyarak POM dizayn modeli kullandım. 
Projeyi yapılandırmak için Maven, versiyon kontrol aracı olarak Git/Github kullandım. 
<br/>
<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.appium.com" target="_blank" rel="noreferrer"> <img src="https://miro.medium.com/max/698/0*Ar7dArTvLIGrRs2n.png" alt="Selenium" width="100" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="maven" width="100" height="40"/> </a>

<br/>
<br/>
Vysor uygulaması ile USB aracılığıyla gerçek telefona bağlandım. Appium la bağlantıyı gerçekleştirip
Appium Inspector'la locate aldım. Appium Inspectorla alınamayan locateleri telefonumun koordinatlarını 
açıp Touch Action classı ile koordinatları girerek testi tamamladım. <br/>
Xiaomi Note 9 Pro <br/>
Özellikler = Android 11,  ekran  1080 X 2400  <br/>
<br/>
<b>LÜTFEN BU ÖZELLİKLERE SAHİP TELEFONU KURUP TEST YAPINIZ.</b>
<br/>

<br/>
<img src="https://github.com/ErvaYucedal/VodafoneMobileTestAutomation/blob/main/appiumfoto.png" width="auto" >



<hr/>

## Runner Dosyası <br/>
Runner classında kullandığım notasyonlar sayesinde burda çalıştırabildiğim <b>feature</b>  dosyalarının hem raporlarını alabiliyorum hemde istenilen methodların oluşturulması sağlanabiliyor 

## Screen Dosyası <br/>
Bu dosyada Yanımda mobil uygulamasının testlerini gerçekleştireceğim elementlerin locatelerini sakladığım class bulunmaktadır. 

## StepDefinitons Dosyası <br/>
Step Definitions dosyasında  tüm kodlarımın çalışmasını sağlayan methodlarımın bulunduğu class bulunmakta. Ayrıca ekran görüntüsü almak içinde bu dosyayı kullanıyorum. 
 
### Utilities Dosyası <br/>
Utilies dosyasında sürekli lazım olan classlar ve methodlar bulunuyor. Kod tasarrufuna gitmeyi ve projeyi daha anlaşılır hale getirmeyi sağlıyor. 
<b> ConfigReader.class</b> , <b> Driver.class </b> ,  <b> ReusableMehods.class </b>   dosyaları bulunmaktadır. 

## Resources Dosyası <br/>
<b> feature </b> dosyasının bulunduğu dosyadır.Burda <b>BDD</b> (behavior Driven Development) kullanılarak ve <b> Gherking </b> dili kullanılarak featuremiz oluşturuluyor.Java kodlama dilini bilmeyen kişilerin daha iyi anlamasını sağlamaktadır.

## <b> Configuration.properties </b>
Properties dosyamızda sürekli kullandığımız variablelarımız bulunmakta , bu veriabları kullanmak için properties dosyası <b> Key  =  value </b> olaraka oluşturulmakta ,burdaki bilgileri başaka classlara çağırabilmek için utilities dosyasından
<b> ConfigReader </b> classı çağırırlara içindeki method saysınde bu bosyada bulunan bilgileri istediğimiz yerlere çağırabiliriz.

## pom.xml
Pom.xml dosyasında kullanmak istediğimiz kodların kütüphanesini  <b> dependencies </b> tagının içerisine yerleştirip güncel bilgilerini sürekli olarak kendimizde tutabiliriz.

<hr/>



 





<br/>
