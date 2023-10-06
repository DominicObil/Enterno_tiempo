		float velocidad;
		float distancia;
		float tiempo;




		Scanner teclado = new Scanner(System.in);//
		System.out.printf("introduzca velocidad en km/h ");
		
		velocidad =teclado.nextInt();



		Scanner tecladox = new Scanner(System.in);
		System.out.printf("introduzca distancia en km ");
		distancia =tecladox.nextInt();


		tiempo=distancia/velocidad;
		System.out.printf("el tiempo que tardara será " +tiempo+" Horas");
		

		
		
	}
	}
