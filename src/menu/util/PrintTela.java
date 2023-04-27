package menu.util;


public class PrintTela {

	//Reset Color
	public static final String TEXT_RESET = "\u001B[0m";
	//Text Color
	public static final String TEXT_BLACK = "\u001B[30m" ;
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_YELLOW_BOLD = "\033[1;33m"; 
	public static final String TEXT_WHITE_BOLD = "\033[1;37m";
	// Background Color
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	
	
		/* print da ária de lanches */
		public static void escolhaLanches() {
			System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
					+ "-------------------------------------------------------------- ");
			System.out.println("                   ESCOLHA SEU LANCHE                          ");
			System.out.println("---------------------------------------------------------------");
			System.out.println(" _____________________________________________________________ ");
			System.out.println("|                                                             |");
			System.out.println("|   1 CHICKEN BARBECUE BURGER-------------avulso R$ 24,90     |");
			System.out.println("|   2 CLASSIC BACON BURGER ---------------avulso R$ 29,90     |");
			System.out.println("|   3 CHEESE BACON BURGER ----------------avulso R$ 27,90     |");
			System.out.println("|   4 BIB´S BURGER PLANT -----------------avulso R$ 24,90     |");
			System.out.println("|   5 TRADICIONAL ROSBIFE ----------------avulso R$ 28,90     |");
			System.out.println("|   6 visualisar sacola e avisos -----------------------      |");
			System.out.println("|   0 sair----------------------------------------------      |");
			System.out.println(" _____________________________________________________________ ");
			System.out.println("                                                               ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("          digite o úmero da opçao que voçê escolhida           ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("" +TEXT_RESET);
		}

		public static void lanche1() {
			System.out.println(TEXT_WHITE_BOLD + ANSI_RED_BACKGROUND
					+ "---------------------------------------------------------------");
			System.out.println("| " + TEXT_BLACK +ANSI_RED_BACKGROUND
					+ "  1 CHICKEN BARBECUE BURGER-------------avulso R$ 24,90   " + TEXT_RESET
					+ TEXT_WHITE_BOLD + ANSI_RED_BACKGROUND + "  |");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Pão de batata com manteiga, com 140 g de frango empanado       ");
			System.out.println("temperado com molho barbecue,cebola roxa fatiada,tomate fatiado");
			System.out.println("alface americana e um molho caprichado de picles               ");
			System.out.println("" + TEXT_RESET);
		}

		public static void lanche2() {
			System.out.println(TEXT_WHITE_BOLD + ANSI_RED_BACKGROUND
					+ "---------------------------------------------------------------");
			System.out.println("|" + TEXT_BLACK + ANSI_RED_BACKGROUND
					+ " CLASSIC BACON BURGER-----------------------avulso R$ 29,90 " + TEXT_RESET
					+ TEXT_WHITE_BOLD +ANSI_RED_BACKGROUND + " |");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Pão de batata com manteiga, com 120 g de hambúrguer de carne,  ");
			System.out.println("mix de cebola roxa e picles picados,crocante                   ");
			System.out.println("sal temperado com pimenta e o molho especial com picles,       ");
			System.out.println("além de ketchup e mostarda Heinz,queijo cheddar bacon fatiado, ");
			System.out.println("" + TEXT_RESET);

		}

		public static void lanche3() {

			System.out.println(TEXT_WHITE_BOLD +ANSI_RED_BACKGROUND
					+ "---------------------------------------------------------------");
			System.out.println("| " +TEXT_BLACK +ANSI_RED_BACKGROUND
					+ "CHEESE BACON BURGER-----------------------avulso R$ 27,90 " +TEXT_RESET
					+ TEXT_WHITE_BOLD + ANSI_RED_BACKGROUND + "  |");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Pão de batata com manteiga, com 120 g de hambúrguer de carne,  ");
			System.out.println("queijo cheddar fatiado, bacon assado fatiado crocante,         ");
			System.out.println("tomate fatiado,alface americana, sal temperado com pimenta e   ");
			System.out.println("uma saborosa maionese verde.                                   ");
			System.out.println("" +TEXT_RESET);

		}

		public static void lanche4() {
			System.out.println(TEXT_WHITE_BOLD +ANSI_RED_BACKGROUND
					+ "---------------------------------------------------------------");
			System.out.println("| " + TEXT_BLACK +ANSI_RED_BACKGROUND
					+ " BIB´S BURGER PLANT-----------------------avulso R$ 24,90   " +TEXT_RESET
					+ TEXT_WHITE_BOLD + ANSI_RED_BACKGROUND + "|");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Pão de batata, 113 g de hambúrguer vegetal, tomate fatiado,    ");
			System.out.println("alface americana,picles e um saboroso molho de tomate          ");
			System.out.println("temperado,Contém ovo na composição do pão                      ");
			System.out.println("" +TEXT_RESET);
		}

		public static void lanche5() {
			System.out.println(TEXT_WHITE_BOLD + ANSI_RED_BACKGROUND
					+ "---------------------------------------------------------------");
			System.out.println("|" + TEXT_BLACK + ANSI_RED_BACKGROUND
					+ "  TRADICIONAL ROSBIFE-----------------------avulso R$ 28,90  " + TEXT_RESET
					+ TEXT_WHITE_BOLD + ANSI_RED_BACKGROUND + "|");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Pão sírio, dois ovos, alface americana, tomate,                ");
			System.out.println("maionese especial,cremely cheddar cremoso e rosbife, é claro!  ");
			System.out.println("" + TEXT_RESET);

		}
	}
