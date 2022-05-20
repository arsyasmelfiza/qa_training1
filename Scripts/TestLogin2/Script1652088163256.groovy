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

WebUI.navigateToUrl('https://devb2c.astraotoparts.co.id/')

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/button_Aktifkan lain kali saja'))

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/div_Masuk'))

WebUI.setText(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/input_Alamat Email atau Nomor HP_sc-1auyczi_6f84f0'), 
    '08984957071')

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/input_Kata Sandi_sc-1auyczi-2 eWsBfk sc-1uj_b30e5a'), 
    '5IdKdwA/f3cXXAsQNTjTlg==')

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/svg'))

WebUI.setText(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/input_Alamat Email atau Nomor HP_sc-1auyczi_6f84f0'), 
    'P@ssw0rd009')

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/button_Login'))

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/div_Profile'))

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/svg_1'))

WebUI.click(findTestObject('Object Repository/TestObjectLogin2/Page_AOP/div_Keluar'))

WebUI.closeBrowser()

