/**
 * Interfaz para el manejo de las caracteristicas basicas de una radio.
 *
 * @author Pablo Sao
 * @version 1.1
 * @date 14/01/2019
 */
public interface iRadio
{
    /**
     * Metodo para cambiar de frecuencia seleccionada en la radio.
     *
     * @return retorna la frecuencia seleccionada
     */
    public boolean cambiarAmFm();

    /**
     * Metodo para manejar el encendido y apagado de la radio
     *
     */
    public boolean encendidoRadio();

    /**
     * Metodo para subir la frecuencia que se encuentra actualmente en la radio.
     *
     * @return Nueva frecuencia a reproducir en la radio.
     */
    public double subirFrecuencia();

    /**
     * Metodo para bajar la frecuencia que se encuentra actualmente en la radio.
     *
     */
    public double bajarFrecuencia();

    /**
     * Metodo para almacenar la frecuencia en el boton seleccionado
     */
    public void setFavorito(int posicion);

    /**
     * Metodo para obtener la frecuencia almacenada en el boton, segun la emisora.
     *
     */
    public double getFavorito(int posicion);

}