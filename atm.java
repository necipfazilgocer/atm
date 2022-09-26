package atm;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) 
	{
		String secenekler="BAKİYE GÖRÜNTÜLEMEk İÇİN-- 1 \n"+"PARA ÇEKMEK İÇİN---2 \n" +"FARKLI HESABA PARA YATIRMAK İÇİN----3 \n"+"ÇIKMAK İÇİN...4 ";
		Scanner scanner=new Scanner(System.in);
		System.out.println("ATM'YE HOŞGELDİNİZ");
		System.out.println("LÜTFEN BİLGİLERİNİZİ GİRİNİZ.");
		System.out.println("KULLANICI ADI:");
		String kullanici=scanner.nextLine();
		System.out.println("ŞİFRE:");
		String sifre=scanner.nextLine();
		double ahmetbakiye=2000;
		String ahmetiban="1234";
		String ahmetisim="ahmet";
		String ahmetsifre="1234";
		double mehmetbakiye=1000;
		String mehmetiban="0000";
		String mehmetisim="mehmet";
		String mehmetsifre="0000";
		
		if(kullanici.equals("ahmet") && sifre.equals("1234"))
		{
			System.out.println("AHMET'İN HESABINA HOŞGELDİNİZ");
			System.out.println(secenekler);
			System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ");
			String secim=scanner.nextLine();
			switch(secim)
			{
			case "1":
			System.out.println("BAKİYENİZ:"+ahmetbakiye);
			break;
			
			case "2":
			System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ:");
			double ahmetcekilecektutar=scanner.nextInt();
			if(ahmetbakiye>=ahmetcekilecektutar) {
				Double ahmetkalanbakiye=ahmetbakiye-ahmetcekilecektutar;
				System.out.println("KALAN BAKİYENİZ:"+ahmetkalanbakiye);
			}
			else
			{
				System.out.println("YETERSİZ BAKİYE");
			}
			break;
			
			
			case "3":
				System.out.println("YATIRMAK İSTEDİĞİNİZ TUTARI GİRİNİZ.");
				int ahmetyatirilacaktutar=scanner.nextInt();
				if(ahmetbakiye>ahmetyatirilacaktutar)
				{
					System.out.println("IBAN GİRİNİZ.");
					scanner.nextLine();
					String ahmetyatirilacakiban=scanner.nextLine();
									if(ahmetyatirilacakiban.equals(mehmetiban))
												{
												System.out.println(ahmetyatirilacaktutar+"TL PARA MEHMET'İN HESABINA AKTARILDI.");
												ahmetbakiye-=ahmetyatirilacaktutar;
												System.out.println("HESABINIZDA "+ahmetbakiye+" TL KALMIŞTIR.");
												mehmetbakiye+=ahmetyatirilacaktutar;
												}
									else
									{
										System.out.println("YANLIŞ İBAN GİRDİNİZ.");
									}
					
				}
				
				else
				{
					System.out.println("YETERSİZ BAKİYE.");
				}
				
			
			}
			
			
		}
		
		
		
		
		
		else if (kullanici.equals("mehmet") && sifre.equals("0000"))
		{
			System.out.println("MEHMET'İN HESABINA HOŞGELDİNİZ.");
			System.out.println(secenekler);
			System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ");
			String secim=scanner.nextLine();
			
			switch(secim)
			{
			case "1":
			System.out.println("BAKİYENİZ:"+mehmetbakiye);
			break;
			
			case "2":
			System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ:");
			double mehmetcekilecektutar=scanner.nextInt();
							if(mehmetbakiye>=mehmetcekilecektutar) 
								{
									Double mehmetkalanbakiye=mehmetbakiye-mehmetcekilecektutar;
									System.out.println("KALAN BAKİYENİZ:"+mehmetkalanbakiye);
								}
								else
									{
									System.out.println("YETERSİZ BAKİYE");
									}
			break;
			
			
			case "3":
				System.out.println("YATIRMAK İSTEDİĞİNİZ TUTARI GİRİNİZ.");
				double mehmetyatirilacaktutar=scanner.nextInt();
						if(mehmetbakiye>=mehmetyatirilacaktutar)
							{
								System.out.println("IBAN GİRİNİZ.");
								scanner.nextLine();
								String mehmetyatirilacakiban=scanner.nextLine();
															if(mehmetyatirilacakiban.equals(ahmetiban))
															{
																System.out.println(mehmetyatirilacaktutar+"TL PARA AHMET'İN HESABINA AKTARILDI.");
																mehmetbakiye-=mehmetyatirilacaktutar;
																System.out.println("HESABINIZDA "+mehmetbakiye+" TL KALMIŞTIR.");
																mehmetbakiye+=mehmetyatirilacaktutar;
															}
														
															else
															{
																System.out.println("YANLIŞ İBAN GİRDİNİZ.");
															}
														
														
					
							}
	
						else
							{
							System.out.println("YETERSİZ BAKİYE.");
							}
				
		
			}
		}
			else
		{
			System.out.println("KULLANICI ADI VEYE ŞİFRE YANLIŞ.");
		}
		
			}
	
}
		
	


