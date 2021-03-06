import java.util.*;

public class test
{
	
	public static void main(String[] args) 
	{
		/*
		 * Buat character creation-nya.
		 * Nama 	-> Input
		 * Gender	-> Pilihan
		 * Job 		-> Pilihan
		 * Race 	-> Pilihan
		 * Max. 8 characters.
		 * 
		 * Race description belum ada class-nya. 
		 * Gender description juga belum ada
		 */
		
		String nama = "Undefined";
		String genderString;
		String jobString;
		String raceString;
		CharaGender gender = null;
		CharaJob job = null;
		CharaRace race = null;
		String yes;
		boolean bool = false;
		int i;
		
		Scanner scan = new Scanner(System.in);
		List<Chara> newChara = new ArrayList<Chara>();
		System.out.println("Dungeon and Dragons Character Creation\n\n\n");
		for(i = 0; i < 2; i++) 
		{
			while(bool == false)
			{
				System.out.print("Enter your name : ");
				nama = scan.next();
				System.out.println("\n" + nama + ", is that true ? [Y/N]");
				yes = scan.next();
				if(yes.equalsIgnoreCase("Y"))
				{
					bool = true;
				}
				else
				{
					bool = false;
				}
			}
			
			
			System.out.println("1. MALE");
			System.out.println(CharaGender.getDescription(CharaGender.MALE));
			System.out.println("2. FEMALE");
      System.out.println(CharaGender.getDescription(CharaGender.FEMALE));
			System.out.println("Select your gender : ");
			genderString = scan.next();
			bool = false;
			while(bool == false)
			{
				if(genderString.equalsIgnoreCase("Male") || genderString.equalsIgnoreCase("1"))
				{
					gender = CharaGender.MALE;
					break;
				}
				else if(genderString.equalsIgnoreCase("Female") || genderString.equalsIgnoreCase("2"))
				{
					gender = CharaGender.FEMALE;
					break;
				}
				else
				{
					System.out.println("There's no such gender.");
				}
			}
			
			System.out.println("\n\n"
							 + "1. Human\n"
							 + "2. Elves\n"
							 + "3. Orcs\n"
							 + "4. Goblin\n"
							 + "5. Gnome\n"
							 + "6. Halfling\n"
							 + "7. Dwarves\n"
							 + "8. Khajiit\n"
							 + "9. Argonian\n");
			
			while(bool == false)
			{
				System.out.print("Select your Race : ");
				raceString = scan.next();
				System.out.println("\n");
				if(raceString.equalsIgnoreCase("Human") || genderString.equals("1"))
				{
					race = CharaRace.HUMAN;
				}
				else if(raceString.equalsIgnoreCase("Elves") || genderString.equals("2"))
				{
					race = CharaRace.ELF;

				}
				else if(raceString.equalsIgnoreCase("Orcs") || genderString.equals("3"))
				{
					race = CharaRace.ORC;
				}
				else if(raceString.equalsIgnoreCase("Goblin") || genderString.equals("4"))
				{
					race = CharaRace.GOBLIN;
				}
				else if(raceString.equalsIgnoreCase("Gnome") || genderString.equals("5"))
				{
					race = CharaRace.GNOME;
				}
				else if(raceString.equalsIgnoreCase("Halfling") || raceString.equalsIgnoreCase("Hobbit") || genderString.equals("6"))
				{
					race = CharaRace.HALFLING;
				}
				else if(raceString.equalsIgnoreCase("Dwarves") || genderString.equals("7"))
				{
					race = CharaRace.DWARF;
				}
				else if(raceString.equalsIgnoreCase("Khajiit") || genderString.equals("8"))
				{
					race = CharaRace.KHAJIIT;
				}
				else if(raceString.equalsIgnoreCase("Argonian") || genderString.equals("9"))
				{
					race = CharaRace.ARGONIAN;
				}
				else
				{
					System.out.println("There's no such race.\n");
				}
				System.out.println(CharaRace.getDescription(race));
				System.out.println("\nSelect " + raceString + "? [Y/N]");
				yes = scan.next();
				if(yes.equalsIgnoreCase("Y"))
				{
					bool = true;
				}
			}
			
			System.out.println("\nClass : \n"
							 + "1. Barbarian\n"
							 + "2. Bard\n"
							 + "3. Cleric\n"
							 + "4. Druid\n"
							 + "5. Fighter\n"
							 + "6. Mage\n"
							 + "7. Monk\n"
							 + "8. Paladin\n"
							 + "9. Ranger\n"
							 + "10. Sorcerer\n"
							 + "11. Thief\n");
			bool = false;
			while(bool == false)
			{
				System.out.print("Select your class : ");
				jobString = scan.next();
				if(jobString.equalsIgnoreCase("Barbarian") || genderString.equalsIgnoreCase("1"))
				{
					job = CharaJob.BARBARIAN;
				}
				else if(jobString.equalsIgnoreCase("Bard") || genderString.equalsIgnoreCase("2"))
				{
					job = CharaJob.BARD;
				}
				else if(jobString.equalsIgnoreCase("Cleric") || genderString.equalsIgnoreCase("3"))
				{
					job = CharaJob.CLERIC;
				}
				else if(jobString.equalsIgnoreCase("Druid") || genderString.equalsIgnoreCase("4"))
				{
					job = CharaJob.DRUID;
				}
				else if(jobString.equalsIgnoreCase("Fighter") || genderString.equalsIgnoreCase("5"))
				{
					job = CharaJob.FIGHTER;
				}
				else if(jobString.equalsIgnoreCase("Mage") || genderString.equalsIgnoreCase("6"))
				{
					job = CharaJob.MAGE;
				}
				else if(jobString.equalsIgnoreCase("Monk") || genderString.equalsIgnoreCase("7"))
				{
					job = CharaJob.MONK;
				}
				else if(jobString.equalsIgnoreCase("Paladin") || genderString.equalsIgnoreCase("8"))
				{
					job = CharaJob.PALADIN;
				}
				else if(jobString.equalsIgnoreCase("Ranger") || genderString.equalsIgnoreCase("9"))
				{
					job = CharaJob.RANGER;
				}
				else if(jobString.equalsIgnoreCase("Sorcerer") || genderString.equalsIgnoreCase("10"))
				{
					job = CharaJob.SORCERER;
				}
				else if(jobString.equalsIgnoreCase("Thief") || genderString.equalsIgnoreCase("11"))
				{
					job = CharaJob.THIEF;
				}
				else
				{
					System.out.println("There's no such class.");
				}
				System.out.println(CharaJob.getDescription(job));
				System.out.println("\nSelect " + jobString + "? [Y/N]");
				yes = scan.next();
				if(yes.equalsIgnoreCase("Y"))
				{
					bool = true;
				}
			}
			
			newChara.add(new Chara(nama, gender, job, race));
		}
		
		for(i = 0; i < 2; i++)
		{
			System.out.println(newChara.get(i).getCharaDescription());
		}

		scan.close();
  	}
}