
public class MataKuliah
{
	private String namaMataKuliah;
	private int jumlahSKS;
	private boolean isInti;
	private MataKuliah mataKuliah[];
	private String dosenPengampu[];
	private PegawaiDosen listDosen;
	
	public MataKuliah()
	{
		this.generateListMataKuliah();
	}
	public MataKuliah(String namaMataKuliah, int jumlahSKS, boolean isInti)
	{
		this.namaMataKuliah = namaMataKuliah;
		this.jumlahSKS = jumlahSKS;
		this.isInti = isInti;
	}
	
	private void generateListMataKuliah()
	{
		// TODO Auto-generated method stub
		mataKuliah = new MataKuliah[20];
		
		this.mataKuliah[0] = new MataKuliah("Pemrograman Berbasis Objek", 3, true);
		//this.mataKuliah[0].setDosenPengampu(listDosen.getDosen(0).getNamaPegawai(), 0);
		this.mataKuliah[1] = new MataKuliah("Pemrograman Berbasis Web", 3, false);
		this.mataKuliah[2] = new MataKuliah("Basis Data Lanjutan", 3, true);
		this.mataKuliah[3] = new MataKuliah("Komputasi Statistik", 3, false);
		this.mataKuliah[4] = new MataKuliah("Statistika Matematika 2", 3, true);
		this.mataKuliah[5] = new MataKuliah("Analisis Regresi", 3, false);
		this.mataKuliah[6] = new MataKuliah("Survei Contoh", 3, false);
	}
	public String getDosenPengampu(int index)
	{
		return dosenPengampu[index];
	}
	public void setDosenPengampu(String dosenPengampu, int index)
	{
		this.dosenPengampu[index] = dosenPengampu;
	}
	public String getNamaMataKuliah()
	{
		return namaMataKuliah;
	}
	public void setNamaMataKuliah(String namaMataKuliah)
	{
		this.namaMataKuliah = namaMataKuliah;
	}
	public int getJumlahSKS()
	{
		return jumlahSKS;
	}
	public void setJumlahSKS(int jumlahSKS)
	{
		this.jumlahSKS = jumlahSKS;
	}
	public boolean isInti()
	{
		return isInti;
	}
	public void setInti(boolean isInti)
	{
		this.isInti = isInti;
	}
	public MataKuliah[] getMataKuliah()
	{
		return mataKuliah;
	}
	public void setMataKuliah(MataKuliah[] mataKuliah)
	{
		this.mataKuliah = mataKuliah;
	}
}
