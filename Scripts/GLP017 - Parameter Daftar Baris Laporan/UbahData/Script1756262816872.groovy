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

WebUI.setText(findTestObject('Object Repository/UbahData/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/UbahData/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/UbahData/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/UbahData/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/UbahData/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 'GLPM0015')

WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/span_Run'))

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

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:i:']"),'KAS TEST')
 
WebUI.sendKeys(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:i:']"), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/img_koreksi_xui.UI.TreeGrid-CMDa-r_a_edit'))

TestObject Detail = new TestObject("Detail")
Detail.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:s:")

WebUI.waitForElementClickable(Detail, 10)
WebUI.click(Detail)
WebUI.delay(1)

TestObject optionDetail = new TestObject("optionDetail")
optionDetail.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='TIDAK']")

WebUI.waitForElementClickable(optionDetail, 10)
WebUI.click(optionDetail)
WebUI.delay(1)


WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:p:']"),'4')
 
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:t:']"),'4')
 
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

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ak:']"))
 
WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/span_Ya'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:al:']"))

WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/UbahData/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

