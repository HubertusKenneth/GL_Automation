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

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (4)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (4)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (4)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Favorites (4)'))

WebUI.rightClick(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (4)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Create New Favorite (4)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (4)'), 
    'GLPM0031')

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Run (4)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/label_Urut Berdasarkan_xui.UI.Labelw (1)'))

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Kode_xui.UI.Input-INPUTl'), 
    'KEN')

WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Keterangan_xui.UI.Input-INPUTm'), 
    'TESTING')

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/label_id_xui.UI.Labelaa'))

//WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_id_xui.UI.ComboInput-INPUTo'), 
//    'saldo')
//
//WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_id_xui.UI.ComboInput-INPUTo'), 
//    Keys.chord(Keys.ENTER))


WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:b:-c_a']"))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:o:']"),'saldo')

WebUI.sendKeys(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:b:-c_a']"),
	Keys.chord(Keys.ENTER))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLCAPTION:d:-c_a']"))

//WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:aj:']"))
//	 
//WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLA:b:-c_a']"))
// 
// WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:o:']"),'saldo')
// 
// WebUI.sendKeys(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:o:']"),
//	 Keys.chord(Keys.ENTER))
// 
// WebUI.doubleClick(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.TreeGrid-CELLCAPTION:c:-c_a']"))
 
//WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_HAKTARIK - SALDO HAK TARIK_xui.UI.Com_9b22b3'), 
//    'product_id')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:o:']"))
 
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:o:']"),'product_id')
 

WebUI.sendKeys(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:o:']"), 
    Keys.chord(Keys.ENTER))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ai:']"))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Ya (4)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K_1_2'))

//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/label_Urut Berdasarkan_xui.UI.Labelw (1)'))
//
//WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Kode_xui.UI.Input-INPUTl'), 
//    'ADP')
//
//WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_Keterangan_xui.UI.Input-INPUTm'), 
//    'AUTODEBET DENDA')
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/label_id_xui.UI.Labelaa'))
//
//WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_id_xui.UI.ComboInput-INPUTo'), 
//    'SALDO')
//
//WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_id_xui.UI.ComboInput-INPUTo'), 
//    Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_4'))
//
//WebUI.setText(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_HAKTARIK - SALDO HAK TARIK_xui.UI.Com_9b22b3'), 
//    'product_id')
//
//WebUI.sendKeys(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/input_HAKTARIK - SALDO HAK TARIK_xui.UI.Com_9b22b3'), 
//    Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Simpan (4)'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Ya (4)'))
//
//WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_O K_1_2'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/img_START_xui.UI.Imagec (4)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Sign Out (4)'))

WebUI.click(findTestObject('Object Repository/TambahDataBaru/Page_ARB Banking System/span_Yes (4)'))

WebUI.closeBrowser()

