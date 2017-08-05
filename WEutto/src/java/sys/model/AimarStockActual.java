package sys.model;

public class AimarStockActual implements java.io.Serializable {

    private String rucCompanyia;
    private String codEstablecimiento;
    private int codCentroc;
    private int codAiAlmacen;
    private int codArea;
    private String codAiProduc;
    private int codPresentacion;
    private int numCantidadPresentacion;
    private int stockInicial;
    private int stockLog;
    private int stockActual;
    private String fecUltInv;
    private int costoPromSol;
    private int costoPromDol;
    private int costoPromIniSol;
    private int costoPromIniDol;
    private int totalIngSol;
    private int totalIngDol;
    private int totalSalSol;
    private int totalSalDol;
    private int totalCantIngreso;
    private int totalCantSalida;
    private int totalStockIniSol;
    private int totalStockIniDol;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;
    private AimarProductos aimarProductos;

//    private String rucCompanyia;
//    private String codEstablecimiento;
    private AgmaeCentrocosto agmaeCentrocosto;
    private AgmaeArea agmaeArea;
    private AimarAlmacen aimarAlmacen;

    public AimarStockActual() {
        
         aimarProductos=new AimarProductos();
        
        agmaeCentrocosto=new AgmaeCentrocosto();
        agmaeArea=new AgmaeArea();
        aimarAlmacen=new AimarAlmacen();
        
    }

    public String getRucCompanyia() {
        return rucCompanyia;
    }

    public void setRucCompanyia(String rucCompanyia) {
        this.rucCompanyia = rucCompanyia;
    }

    public String getCodEstablecimiento() {
        return codEstablecimiento;
    }

    public void setCodEstablecimiento(String codEstablecimiento) {
        this.codEstablecimiento = codEstablecimiento;
    }

    public int getCodCentroc() {
        return codCentroc;
    }

    public void setCodCentroc(int codCentroc) {
        this.codCentroc = codCentroc;
    }

    public int getCodAiAlmacen() {
        return codAiAlmacen;
    }

    public void setCodAiAlmacen(int codAiAlmacen) {
        this.codAiAlmacen = codAiAlmacen;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public String getCodAiProduc() {
        return codAiProduc;
    }

    public void setCodAiProduc(String codAiProduc) {
        this.codAiProduc = codAiProduc;
    }

    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public int getNumCantidadPresentacion() {
        return numCantidadPresentacion;
    }

    public void setNumCantidadPresentacion(int numCantidadPresentacion) {
        this.numCantidadPresentacion = numCantidadPresentacion;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public int getStockLog() {
        return stockLog;
    }

    public void setStockLog(int stockLog) {
        this.stockLog = stockLog;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getFecUltInv() {
        return fecUltInv;
    }

    public void setFecUltInv(String fecUltInv) {
        this.fecUltInv = fecUltInv;
    }

    public int getCostoPromSol() {
        return costoPromSol;
    }

    public void setCostoPromSol(int costoPromSol) {
        this.costoPromSol = costoPromSol;
    }

    public int getCostoPromDol() {
        return costoPromDol;
    }

    public void setCostoPromDol(int costoPromDol) {
        this.costoPromDol = costoPromDol;
    }

    public int getCostoPromIniSol() {
        return costoPromIniSol;
    }

    public void setCostoPromIniSol(int costoPromIniSol) {
        this.costoPromIniSol = costoPromIniSol;
    }

    public int getCostoPromIniDol() {
        return costoPromIniDol;
    }

    public void setCostoPromIniDol(int costoPromIniDol) {
        this.costoPromIniDol = costoPromIniDol;
    }

    public int getTotalIngSol() {
        return totalIngSol;
    }

    public void setTotalIngSol(int totalIngSol) {
        this.totalIngSol = totalIngSol;
    }

    public int getTotalIngDol() {
        return totalIngDol;
    }

    public void setTotalIngDol(int totalIngDol) {
        this.totalIngDol = totalIngDol;
    }

    public int getTotalSalSol() {
        return totalSalSol;
    }

    public void setTotalSalSol(int totalSalSol) {
        this.totalSalSol = totalSalSol;
    }

    public int getTotalSalDol() {
        return totalSalDol;
    }

    public void setTotalSalDol(int totalSalDol) {
        this.totalSalDol = totalSalDol;
    }

    public int getTotalCantIngreso() {
        return totalCantIngreso;
    }

    public void setTotalCantIngreso(int totalCantIngreso) {
        this.totalCantIngreso = totalCantIngreso;
    }

    public int getTotalCantSalida() {
        return totalCantSalida;
    }

    public void setTotalCantSalida(int totalCantSalida) {
        this.totalCantSalida = totalCantSalida;
    }

    public int getTotalStockIniSol() {
        return totalStockIniSol;
    }

    public void setTotalStockIniSol(int totalStockIniSol) {
        this.totalStockIniSol = totalStockIniSol;
    }

    public int getTotalStockIniDol() {
        return totalStockIniDol;
    }

    public void setTotalStockIniDol(int totalStockIniDol) {
        this.totalStockIniDol = totalStockIniDol;
    }

    public String getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(String fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public String getHorCreacion() {
        return horCreacion;
    }

    public void setHorCreacion(String horCreacion) {
        this.horCreacion = horCreacion;
    }

    public int getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(int codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public String getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(String fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public String getHorActualizacion() {
        return horActualizacion;
    }

    public void setHorActualizacion(String horActualizacion) {
        this.horActualizacion = horActualizacion;
    }

    public int getCodUsuarioActualizacion() {
        return codUsuarioActualizacion;
    }

    public void setCodUsuarioActualizacion(int codUsuarioActualizacion) {
        this.codUsuarioActualizacion = codUsuarioActualizacion;
    }

    public AimarProductos getAimarProductos() {
        return aimarProductos;
    }

    public void setAimarProductos(AimarProductos aimarProductos) {
        this.aimarProductos = aimarProductos;
    }
    
    

    public AgmaeCentrocosto getAgmaeCentrocosto() {
        return agmaeCentrocosto;
    }

    public void setAgmaeCentrocosto(AgmaeCentrocosto agmaeCentrocosto) {
        this.agmaeCentrocosto = agmaeCentrocosto;
    }

    public AgmaeArea getAgmaeArea() {
        return agmaeArea;
    }

    public void setAgmaeArea(AgmaeArea agmaeArea) {
        this.agmaeArea = agmaeArea;
    }

    public AimarAlmacen getAimarAlmacen() {
        return aimarAlmacen;
    }

    public void setAimarAlmacen(AimarAlmacen aimarAlmacen) {
        this.aimarAlmacen = aimarAlmacen;
    }

    
    
    
    
}
