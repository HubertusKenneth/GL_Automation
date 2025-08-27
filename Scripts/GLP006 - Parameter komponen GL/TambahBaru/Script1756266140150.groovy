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

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (3)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (3)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Favorites (3)'))

WebUI.rightClick(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Create New Favorite (3)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (3)'), 
    'GLPM0017')

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Run (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/label_AKTIF_xui.UI.Labelw (1)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Kode Komponen_xui.UI.Input-INPUTg'), 
    'HKAKEN')

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Nama Komponen_xui.UI.Input-INPUTh'), 
    'KEN TEST')

//WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Tabel Relasi_xui.UI.Input-INPUTi'), 
//    'gl')
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_DEPOSITO'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_FIXED ASSET'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_PINJAMAN'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_TABUNGAN'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_DEPOSITO_1'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_FIXED ASSET_1'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Simpan (3)'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K (3)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Tabel Relasi_xui.UI.Input-INPUTi'), 
    'gl_para_prodgl')

//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Simpan (3)'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_DEPOSITO_1'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_FIXED ASSET'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_PINJAMAN_1'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_TABUNGAN_1'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Simpan (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Ya (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K_1 (1)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/img_START_xui.UI.Imagec (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Sign Out (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Yes (3)'))

WebUI.closeBrowser()

