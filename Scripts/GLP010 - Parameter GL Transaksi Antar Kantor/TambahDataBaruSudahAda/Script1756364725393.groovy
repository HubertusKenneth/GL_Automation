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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (9)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (9)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (9)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Favorites (9)'))

WebUI.rightClick(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (9)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Create New Favorite (9)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (9)'), 
    'GLPM0041')

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Run (9)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/label_AKTIF_xui.UI.Labelw (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Kantor_xui.UI.ComboInput-INPUTo (1)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_371-KANTOR CABANG NGALIYAN (1)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_COA RAK Kantor_xui.UI.Input-INPUTj (1)'), 
    'KEN')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_COA RAK Kantor_xui.UI.Input-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_1 (4)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_COA RAK Induk_xui.UI.Input-INPUTk (1)'), 
    'KEN')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_COA RAK Induk_xui.UI.Input-INPUTk (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_1 (4)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Simpan (9)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Ya (8)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K (9)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/img_START_xui.UI.Imagec (9)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Sign Out (9)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Yes (9)'))

WebUI.closeBrowser()

