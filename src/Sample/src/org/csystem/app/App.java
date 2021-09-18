/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiğini döndüren getDayOfWeek isimli metodu yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
		- Metot geçersiz bir tarih durumunda -1 değerine geri dönecektir
		- Haftanın günü 1.1.1900 ile verilen tariharasındaki (verilen tarih dahil) gün sayısının 7(yedi) ile bölümünden
		elde edilen kalan ile bulunabilir. Değer 0(sıfır) ise "Pazar", 1(bir) ise "Pazartesi", ... 6(altı) ise "Cumartesi"
		günlerine karşılık gelir
		- 1.1.1900 öncesindeki tarihler geçersizler kabul edilir
		- Parametresi ile aldığı gün, ay ve yıl bilgilerine ilişkin tarihin hafta sonu olup olmadığını test eden isWeekend
		ve hafta içi olup olmadığını test eden isWeekday metotlarını yazınız. Metotlar tarih geçerliliği kontrolü yapmayacaktır
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.application.date.DateUtilTest;

class App {
	public static void main(String [] args)
	{
		DateUtilTest.run();
	}
}

