class GrandFather
	{
		String grandson1()
		{
			String land = "500.12 acre";
			int home = 10;
			int money = 1005879;
			System.out.println("Assets from GrandFather Land is : " + land);
			return "";
		}
	}
class Father extends GrandFather
	{
		static void grandson2()
		{
			int trees = 500;
			int cars = 12;
			int balance = 1000000;
			System.out.println("Assets from Father Cars is : " + cars);
		}
	}
class Son extends Father
	{
		void grandson3()
		{
			int gold = 10;
			float silver = 10.25f;
			int cash = 1000;
			System.out.println("Assets from Son Gold is : " + gold);
		}
	}
class MultilevelInheritance
	{
		public static void main(String[] args)
		{
			Son GA = new Son();
			GA.grandson1();
			GA.grandson2();
			GA.grandson3();
			System.out.println("Assets from GrandFather " + GA.grandson1());
		}
	}
