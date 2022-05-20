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

WebUI.click(findTestObject('Object Repository/TestObjectRandom/Page_AOP/div_Cari produk atau servis yang dekat deng_9b1f7b'))

WebUI.click(findTestObject('Object Repository/TestObjectRandom/Page_AOP/div_Lainnya_sc-183so67-0 kzivxM'))

WebUI.click(findTestObject('Object Repository/TestObjectRandom/Page_AOP/img_Suku Cadang_sc-1hxhqap-2 jOfcLH'))

WebUI.click(findTestObject('Object Repository/TestObjectRandom/Page_AOP/svg'))

WebUI.closeBrowser()

