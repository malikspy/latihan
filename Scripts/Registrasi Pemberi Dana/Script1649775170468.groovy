import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

// Global Variable Phone
String Time = new SimpleDateFormat('ddHHmmss').format(Calendar.getInstance().getTime())

String no = 62851 + Time

GlobalVariable.Phone = no

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.comment('Masuk ke halaman web login')

WebUI.verifyElementText(findTestObject('Daftar/belum punya Akun'), 'Belum memiliki Akun ? Daftar disini')

WebUI.click(findTestObject('Daftar/Daftar disini'))

'User Memilih Pemberi Dana'
WebUI.comment('Masuk menuju halaman jenis Akun')

WebUI.delay(2)

WebUI.click(findTestObject('Daftar/1. Registrasi Pemberi Dana/Pemberi dana'))

WebUI.delay(1)

WebUI.setText(findTestObject('Daftar/1. Registrasi Pemberi Dana/Nama lengkap'), 'Testingers')

String ts = System.currentTimeMillis().toString()

String tambahEmail = ts

GlobalVariable.email = tambahEmail

WebUI.setText(findTestObject('Daftar/1. Registrasi Pemberi Dana/Email'), ts + '@inboxkitten.com')

WebUI.setText(findTestObject('Daftar/1. Registrasi Pemberi Dana/PhoneNumber'), GlobalVariable.Phone)

'Password di enkripsi'
WebUI.setEncryptedText(findTestObject('Daftar/1. Registrasi Pemberi Dana/Password'), 'nM+yxytsbVExwYpLLLYeHg==')

'Individual'
WebUI.click(findTestObject('Daftar/1. Registrasi Pemberi Dana/jenisAkun'))

'Instagram'
WebUI.selectOptionByLabel(findTestObject('Daftar/1. Registrasi Pemberi Dana/BagaimanaKamuTauAlami'), 'Instagram', true)

WebUI.delay(4)

'Click Lanjutkan ke tahap 2'
WebUI.click(findTestObject('Daftar/1. Registrasi Pemberi Dana/Daftar Alami'))

WebUI.delay(2)

'Kebijakan dan Privasi'
WebUI.comment('Fase 2')

WebUI.click(findTestObject('Daftar/2. Kebijakan dan Privasi/Ceklis Tertarik Update Info Terbaru'))

WebUI.scrollToElement(findTestObject('Daftar/2. Kebijakan dan Privasi/Scroll Webview'), 3)

WebUI.scrollToPosition(9999, 9999)

WebUI.delay(2)

'Menyetujui Kebijakan'
WebUI.click(findTestObject('Daftar/2. Kebijakan dan Privasi/Setujui kebijakan'))

WebUI.delay(5)

'Next ke fase 3\n'
WebUI.click(findTestObject('Daftar/2. Kebijakan dan Privasi/Lanjutkan ke Slide 3'))

WebUI.comment(' Next ke Fase 3 : Aktivasi Email')

WebUI.delay(10)

