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

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (7)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (7)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (7)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Favorites (7)'))

WebUI.rightClick(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (7)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Create New Favorite (7)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (7)'), 
    'GLPM0045')

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Run (7)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/label_Urut Berdasarkan_xui.UI.Labelx (2)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Nama Aplikasi_xui.UI.ComboInput-INPUTo (2)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_DEPOSITO (3)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Produk_xui.UI.ComboInput-INPUTp (2)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_DTC - KEN TEST'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Produk_xui.UI.ComboInput-INPUTp (2)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_MT - MIA TEST'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Produk_xui.UI.ComboInput-INPUTp (2)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_PC - KENNETH TEST'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_gl_para_coa_id_xui.UI.TreeGrid-CELLAb-c_a (2)'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:b:-c_d']"))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_TTPPJK - TITIPAN  PAJAK_xui.UI.ComboI_360586 (1)'), 
    'KENNETH')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_TTPPJK - TITIPAN  PAJAK_xui.UI.ComboI_360586 (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_1 (2)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_AMORBEBAN - GL BEBAN AMORTISASI_xui.UI_d6508f (2)'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:b:-c_i']"))
 
WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_TTPPJK - TITIPAN  PAJAK_xui.UI.ComboI_360586 (1)'), 
    'KENNETH')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_TTPPJK - TITIPAN  PAJAK_xui.UI.ComboI_360586 (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_1 (2)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Simpan (7)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Ya (6)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K (7)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/img_START_xui.UI.Imagec (7)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Sign Out (7)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Yes (7)'))

WebUI.closeBrowser()

