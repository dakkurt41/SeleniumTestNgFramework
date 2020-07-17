package tests.Formy;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import java.util.*;

public class PracticeIterations {

   // desripton of userstory


    //Steps to reproduce
    // go to home page
    // locate the links
    // put them on list and iterate
    // click on desireable link


    // Acceptance Criteria
    // Click on desirable link using list collections
    // verifty the current url
    public List<String> links() {
        List<String> nameLinks = new ArrayList<>();
        nameLinks.add("Autocomplete");
        nameLinks.add("Buttons");
        nameLinks.add("Checkbox");
        nameLinks.add("Datepicker");
        nameLinks.add("Drag and Drop");
        return nameLinks;
    }

    public Set<String> linkswithset(){
        Set<String> namelinks=new LinkedHashSet<>();
        namelinks.add("Dropdown");
        namelinks.add("Enabled and Disabled elements");
        namelinks.add("File Upload");
        namelinks.add("Keyboard and Mouse Input");
        namelinks.add("Modal");
        return namelinks;
    }


    public Map<String, String> linksWithMap() {
        Map<String, String> nameLinks = new HashMap<>();
        nameLinks.put("1", "Page Scroll");
        nameLinks.put("2", "Radio Button");
        nameLinks.put("3", "Switch Window");
        nameLinks.put("4", "Complete Webform");
        return nameLinks;
    }



    @Test
    public void Test1(){
        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);
        List<WebElement> listLinks = formyHomePage.links;
        int i=0;
        for (WebElement listLink : listLinks) {
            if(listLink.getText().equals(links().get(i))){
                listLink.click();
                break;
            }
            i++;
        }
    }

    @Test
    public void Test2() throws InterruptedException {
        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);
        List<WebElement> listLinks = formyHomePage.links;
        List<String> name=new ArrayList<>();
        name.addAll(linkswithset());
        System.out.println(name);
        for (int i = 0; i <listLinks.size() ; i++) {
            if ((listLinks.get(i).getText()).equals(name.get(2))){
                listLinks.get(i).click();
                Thread.sleep(5000);
                break;
            }
        }
    }


    @Test //Aizhan
    public void Test3() {
        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);
        //converting map to the list
        List<String> names = new ArrayList<String>(linksWithMap().values());
        System.out.println(names.get(1));
        List<WebElement> listLinks = formyHomePage.links;
        for (WebElement listLink : listLinks) {
            if (listLink.getText().equals(names.get(1))) {
                listLink.click();
                break;
            }
        }


        Map<Integer, String> mapHttpErrors = new HashMap<>();

        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");

        System.out.println(mapHttpErrors);
    }





}
