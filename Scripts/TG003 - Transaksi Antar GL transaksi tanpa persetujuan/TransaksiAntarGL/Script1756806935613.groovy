import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), Keys.chord(
        Keys.ENTER))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Stacks-CAPTION:a:b']"))
 
 WebUI.rightClick(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeView-BOX:a:']"))
 
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.PopMenu-CAPTION:g:a']"))
  
 WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:d:']"),'GLTR0001')
 
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ae:']"))

 WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:g:']"),'TESTING')
 
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Label-ICON:v:']"))
 
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:a:-c_c']"))
  
 WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:n:']"),'11262005')
 
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLCAPTION:b:-c_a']"))
 
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:a:-c_e']"))
 
 WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:o:']"),'TEST')
  
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:a:-c_f']"))
  
 WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Combo	Input-INPUT:n:']"),'10000')
 
 WebUI.sendKeys(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:n:']"), Keys.chord(
        Keys.ENTER))
  
 WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.List-CAPTION:e:a']"))
  
  
//WebUI.closeBrowser()

