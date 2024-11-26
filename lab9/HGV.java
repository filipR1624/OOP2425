public class HGV extends RoadVehicle implements ImportDuty{
    private int cargo;

	public HGV(){ 	
		this(0,0,0);	
	}

	public HGV(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}

    public double calculateDuty() {
        return ImportDuty.HGVTAXRATE * super.getWheels();
    }
}
