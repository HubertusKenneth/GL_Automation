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

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (11)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (11)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (11)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Favorites (11)'))

WebUI.rightClick(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (11)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Create New Favorite (11)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (11)'), 
    'GLPM0050')

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Run (11)'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Label-ICON:w:']"))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:q:']"),'KEN')

WebUI.sendKeys(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:q:']"), 
    Keys.chord(Keys.ENTER))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLCAPTION:c:-c_a']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.CheckBox-MARK:c:']"))

//WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Treegrid-MARK:b:-r_d']"))

//WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Treegrid-MARK:b:-r_e']"))
 
WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Simpan (11)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Ya (10)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K (11)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/img_START_xui.UI.Imagec (11)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Sign Out (11)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Yes (11)'))

WebUI.closeBrowser()

