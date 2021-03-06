
public class PegawaiDosen extends Pegawai
{
	private String idDosen;
	private MataKuliah mataKuliah = new MataKuliah();

	public PegawaiDosen dosen[] = new PegawaiDosen[20];
	
	public PegawaiDosen() 
	{
		this.setJabatan("Dosen");
		
		dosen[0] = new PegawaiDosen("Takdir","1998217391260","10191","PBO");
		dosen[1] = new PegawaiDosen("Sukim","1998217391261","10191","PBO");
		dosen[2] = new PegawaiDosen("Siti Mariyah","1998217391262","10191","PBO");
		dosen[3] = new PegawaiDosen("Dr. Azka Ubaidillah","1998217391263","10191","PBO");
		dosen[4] = new PegawaiDosen("Dr. I Made Arcana","1998217391264","10191","PBO");
		dosen[5] = new PegawaiDosen("Yunarso Anang, Ph.D","1998217391265","10191","PBO");
		dosen[6] = new PegawaiDosen("Metty Nurul Romadhona","1998217391266","10191","PBO");
		dosen[7] = new PegawaiDosen("Takdir","1998217391267","10191","PBO");
		dosen[8] = new PegawaiDosen("Takdir","1998217391268","10191","PBO");
		dosen[9] = new PegawaiDosen("Takdir","1998217391269","10191","PBO");
		
		
	}
	
	public PegawaiDosen getDosen(int index)
	{
		return dosen[index];
	}

	public void setDosen(PegawaiDosen dosen, int index)
	{
		this.dosen[index] = dosen;
	}

	public PegawaiDosen(String namaPegawai, String nip, String idDosen, String posisi) {
		this.setNamaPegawai(namaPegawai);
		this.setNip(nip);
		this.setPosisi(posisi);
		this.setIdDosen(idDosen);
		this.setJabatan("Dosen");
	}

	
	void getAllPegawai() {
		System.out.println("Daftar Dosen (" + dosen.length + "):");
		for(int index = 0; index<dosen.length;index++) {
			if(dosen[index] != null) {
				System.out.println("Nama Dosen  = " + dosen[index].getNamaPegawai());
				System.out.println("NIP         = " + dosen[index].getNip());
				System.out.println("ID Dosen    = " + dosen[index].getIdDosen());
				System.out.println("Posisi      = " + dosen[index].getPosisi());
			}
			System.out.println();
		}
		
	}

	public String getIdDosen() {
		return idDosen;
	}

	public void setIdDosen(String idDosen) {
		this.idDosen = idDosen;
	}
}
