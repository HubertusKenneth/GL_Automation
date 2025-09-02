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
 
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:d:']"),'GLPM0015')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ae:']"))


TestObject NamaLaporan = new TestObject("NamaLaporan")
NamaLaporan.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:m:")

WebUI.waitForElementClickable(NamaLaporan, 10)
WebUI.click(NamaLaporan)
WebUI.delay(1)

TestObject optionNamaLaporan = new TestObject("optionNamaLaporan")
optionNamaLaporan.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='GLRP0094 - LAPORAN ARUS KAS TEST']")

WebUI.waitForElementClickable(optionNamaLaporan, 10)
WebUI.click(optionNamaLaporan)
WebUI.delay(1)

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ah:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Label-ICON:w:']"))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:k:']"),'KAS DITERIMA DARI BUNGA YANG AKAN DITERIMA')


TestObject Detail = new TestObject("Detail")
Detail.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:s:")

WebUI.waitForElementClickable(Detail, 10)
WebUI.click(Detail)
WebUI.delay(1)

TestObject optionDetail = new TestObject("optionDetail")
optionDetail.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='YA']")

WebUI.waitForElementClickable(optionDetail, 10)
WebUI.click(optionDetail)
WebUI.delay(1)


WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:p:']"),'1')
 
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:t:']"),'4')
 
//TestObject Saldo = new TestObject("Saldo")
//Saldo.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:q:")
//
//WebUI.waitForElementClickable(Saldo, 10)
//WebUI.click(Saldo)
//WebUI.delay(1)
//
//TestObject optionSaldo = new TestObject("optionSaldo")
//optionSaldo.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='5 - Total Saldo']")
//
//WebUI.waitForElementClickable(optionSaldo, 10)
//WebUI.click(optionSaldo)
//WebUI.delay(1)

TestObject Kegiatan = new TestObject("Kegiatan")
Kegiatan.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:v:")

WebUI.waitForElementClickable(Kegiatan, 10)
WebUI.click(Kegiatan)
WebUI.delay(1)

TestObject optionKegiatan = new TestObject("optionKegiatan")
optionKegiatan.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='2 - Investasi']")

WebUI.waitForElementClickable(optionKegiatan, 10)
WebUI.click(optionKegiatan)
WebUI.delay(1)

TestObject ArusKas = new TestObject("ArusKas")
ArusKas.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:r:")

WebUI.waitForElementClickable(ArusKas, 10)
WebUI.click(ArusKas)
WebUI.delay(1)

TestObject optionArusKas = new TestObject("optionArusKas")
optionArusKas.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='1 - Kas Masuk']")

WebUI.waitForElementClickable(optionArusKas, 10)
WebUI.click(optionArusKas)
WebUI.delay(1)
 
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Label-ICON:z:']"))
 
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:c:-c_a']"))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:w:']"),'10')
 
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:c:-c_b']"))
 
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:x:']"),'10')
 
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ak:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ab:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:al:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Image:c:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:a:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:v:']"))
 
WebUI.closeBrowser()
 