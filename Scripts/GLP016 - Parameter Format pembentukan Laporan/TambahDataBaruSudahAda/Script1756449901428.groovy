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
 
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:d:']"),'GLPM0014')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ae:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Label-ICON:w:']"))

TestObject NamaLaporan = new TestObject("NamaLaporan")
NamaLaporan.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:o:")

WebUI.waitForElementClickable(NamaLaporan, 10)
WebUI.click(NamaLaporan)
WebUI.delay(1)

TestObject optionNamaLaporan = new TestObject("optionNamaLaporan")
optionNamaLaporan.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='INFO SALDO GL']")

WebUI.waitForElementClickable(optionNamaLaporan, 10)
WebUI.click(optionNamaLaporan)
WebUI.delay(1)

TestObject Kolom1 = new TestObject("Kolom1")
Kolom1.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:p:")

WebUI.waitForElementClickable(Kolom1, 10)
WebUI.click(Kolom1)
WebUI.delay(1)

TestObject optionKolom1 = new TestObject("optionKolom1")
optionKolom1.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='SALDO DEBIT TGL BERJALAN']")

WebUI.waitForElementClickable(optionKolom1, 10)
WebUI.click(optionKolom1)
WebUI.delay(1)
 
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ai:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ab:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:aj:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Image:c:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:a:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:v:']"))
 
WebUI.closeBrowser()
 