package JavaAlura.Projeto02.Model;

import com.google.gson.annotations.SerializedName;

public record Veiculo(@SerializedName("Valor") String valorVeiculo ,
                      @SerializedName("Marca") String marcaVeiculo ,
                      @SerializedName("Modelo") String modeloVeiculo ,
                      @SerializedName("AnoModelo") Integer anoVeiculo ,
                      @SerializedName("Combustivel") String combustivelVeiculo ) {
}
