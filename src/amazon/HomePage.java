package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
//    public static void main(String[] args){
// For Chrome Browser
//        String chromeDriver="webdriver.chrome.drive";
//        String choromeDriverPath="BrowserDriver\\Windows\\chromedriver2.exe";
//
//      System.setProperty(chromeDriver,choromeDriverPath);
//
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.amazon.com/");

    //for Firefox Browser
//        String firefoxDriver="WebDriver.gecko.driver";
//        String firefoxDriverPath="BrowserDriver\\Windows\\geckodriver.exe";
//        System.setProperty(firefoxDriver,firefoxDriverPath);
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get ("https://www.amazon.com/");
    public static WebDriver driver = new ChromeDriver();
    public static String chromeDriver = "webDriver.chrome.driver";
    public static String chromeDriverPath = "BrowserDriver\\Windows\\chromedriver2.exe";
    public static String url = "https://www.amazon.com/";
//
    public static void setUp(String browserDriver, String driverPath, String url) {
        System.setProperty(browserDriver, driverPath);
        // for maximize window;
        driver.manage().window().maximize();
//implicitly wait whatever i want for wait;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//       driver.get("https://www.amazon.com/");
        driver.navigate().to(url);
//
    }

    //  variable or WebElements;
    public static String searchField = "//*[@id=\"twotabsearchtextbox\"]";
//    public static String searchProduct = "Hand Sanitizer";


    //# 01
    public static void main(String[] args) throws InterruptedException {
        //Test case 1: search and buy hand sanitizer;
//        searchProduct1();
//        Test case 2: search and buy Foot Ball;
//        searchProduct2();
//        Test case 3:Open new account;
//        searchProduct3();
//        Find best seeller;
//        searchProduct4();
//        Customer service;
//        searchProduct5();
//        New realize
//         searchProduct6();
//        Find gift
//        searchProduct7();
//        Todays deal
//        searchProduct8();
        searchProduct9();
//this method is for search product purpose;
//    @throws Interrupted Exception;
 closeBrowser();
//        driver.quit();
    }
        public static void searchProduct1() throws InterruptedException {
//   Test Case:Buy Hand sanitizer ;
//Test case :

//    Open Browser
//    Navigate to url
            setUp(chromeDriver, chromeDriverPath, url);
//    Enter Keyword in searchBox
////    findElement is a method;
//    driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Hand Sanitizer");
            driver.findElement(By.xpath(searchField)).sendKeys("Hand Sanitizer");
//            Thread.sleep(5000);
//    Click searchButton
            driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
//            Thread.sleep(5000);
//    copy xPath is not for permanately,after 2-3 mins it may be not work,so follow the bellow one
            driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[5]/div/span/div/div/div[2]/h2/a/span")).click();
//write for life time method is(contains(text()<
//    driver.findElement(By.xpath("//*[contains(text(),'//*[@id=\"productTitle\"]']")).click();
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
// for wit 5 sec
//    Thread.sleep(5000);
            String title = driver.getTitle();
            System.out.println(title);
         // closeBrowser();

        }

        //       #2 Buy Foot Ball;

        public static void searchProduct2(){
        setUp(chromeDriver,chromeDriverPath,url);
//        for searching and write Foot Ball;
     driver.findElement(By.xpath(searchField)).sendKeys("Foot Ball");
//     for searching bar clickig
     driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
//     for product clicking;
     driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[10]/div/span/div/div/div[2]/h2/a/span")).click();
//    for add cart clicking;
     driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
//     fpr process to check out;
     driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();

     String title =driver.getTitle();
            System.out.println(title);
       //   closeBrowser();

    }

    public static void searchProduct3(){
        setUp(chromeDriver,chromeDriverPath,url);
//        for searching sign in account and list;
        driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2")).click();

//     for create amazon account;
        driver.findElement(By.cssSelector("#createAccountSubmit")).click();
//     for user name;
        driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Khosru Zaman");
////    for email address;
     driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mdkhosruzzaman@gmail.com");
////     f0r create new account;
       driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        String title =driver.getTitle();
        System.out.println(title);
      //  closeBrowser();
    }
    public static void searchProduct4(){
        setUp(chromeDriver,chromeDriverPath,url);
//        for searching best seller;
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();

//     Retro game consol
        driver.findElement(By.cssSelector("#zg_left_col1 > div:nth-child(1) > div:nth-child(3) > div > div.a-section.a-spacing-none.p13n-asin > a > div.p13n-sc-truncated")).click();
//     Add to cart;
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
////    process to check out;
        driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
////     f0r continue;
        driver.findElement(By.cssSelector("//*[@id=\"continue\"]")).click();

        String title =driver.getTitle();
        System.out.println(title);
      //  closeBrowser();
    }
    public static void searchProduct5(){
        setUp(chromeDriver,chromeDriverPath,url);
//        for customer service;
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();

//     Your order;
        driver.findElement(By.cssSelector("body > div:nth-child(28) > div:nth-child(7) > div.a-column.a-span12 > div > div:nth-child(1) > div:nth-child(1) > a > div")).click();
//     email address;
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("mdkhosruzzaman");
////    process to continue;
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
////     f0r continue;
//        driver.findElement(By.cssSelector("//*[@id=\"continue\"]")).click();

        String title =driver.getTitle();
        System.out.println(title);
        //  closeBrowser();
    }

    public static void searchProduct6(){
        setUp(chromeDriver,chromeDriverPath,url);
//        for new realize;
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)  ")).click();

//     for xenoblade;
        driver.findElement(By.cssSelector("#zg_left_col1 > div:nth-child(1) > div:nth-child(3) > div > div.a-section.a-spacing-none.p13n-asin > a > div.a-section.a-spacing-mini > img")).click();
//     Free order to cart;
        driver.findElement(By.id("add-to-cart-button")).click();
////    processed to check out;
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
////     f0r continue;
//        driver.findElement(By.cssSelector("//*[@id=\"continue\"]")).click();

        String title =driver.getTitle();
        System.out.println(title);
        //  closeBrowser();
    }

    public static void searchProduct7(){
        setUp(chromeDriver,chromeDriverPath,url);
//        for Find Gift;
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();

//     for egift;
        driver.findElement(By.xpath("//*[@id=\"notification-provider\"]/div/div/div[1]/div/a[1]/div/div[1]/img")).click();
//     Amazon gift card;
        driver.findElement(By.xpath("//*[@id=\"gcx-gf-section-0\"]/div/section/div[2]/figure/div/a/div/div/img")).click();
////    Buy it now;
        driver.findElement(By.id("gc-buy-box-bn")).click();
////     f0r continue;
//        driver.findElement(By.cssSelector("//*[@id=\"continue\"]")).click();

        String title =driver.getTitle();
        System.out.println(title);
        //  closeBrowser();
    }


    public static void searchProduct8(){
        setUp(chromeDriver,chromeDriverPath,url);
//        Todays deal;
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();
//
//     for shop all deals;
        driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div/div[3]/div[1]/span/a/div/div[2]/span")).click();
//     Amazon gift card;
        driver.findElement(By.cssSelector("#dealImage > div > div > div.a-row.layer.backGround")).click();
////    Buy it now;
        driver.findElement(By.id("#dealImage > div > div > div.a-row.layer.backGround")).click();
////     f0r continue;
//        driver.findElement(By.cssSelector("//*[@id=\"continue\"]")).click();

        String title =driver.getTitle();
        System.out.println(title);
        //  closeBrowser();
    }

    public static void searchProduct9() {
        setUp(chromeDriver, chromeDriverPath, url);
//        Whole food;
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
//
//     for shop all deals;
        driver.findElement(By.cssSelector("#contentGrid_181041 > div > div > div:nth-child(3) > div > div > a > img")).click();
//     Amazon gift card;
        driver.findElement(By.className("a-button-input")).click();
////    Buy it now;
        driver.findElement(By.className("a-button-input")).click();
////     f0r continue;
//        driver.findElement(By.cssSelector("//*[@id=\"continue\"]")).click();

        String title = driver.getTitle();
        System.out.println(title);
    }
    public static void waitFor(int waitSeconds) throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void closeBrowser() {
//    for close the running window only;
    //   driver.close();
//       Quit all the open windows;
     driver.quit();


    }





}