import axios from 'axios'

export const SHOW_PAISES = 'SHOW_PAISES'
export const SHOW_DETALLE_PAIS = 'SHOW_DETALLE_PAIS'


export function showPaises() {

    return (dispatch, getState) => {
        console.log("showPaises");
        axios.get('https://api.covid19api.com/summary')
            .then((response) => {
                console.log("response showPaises");
                console.log(response.data.Countries )
                dispatch( { type: SHOW_PAISES, payload: response.data.Countries } ) 
            }).catch(error => {
                console.log("error showPaises");
                console.log(error.response)
                dispatch( { type: SHOW_PAISES, payload: [] } ) 
            });
            
    }
    
} 

export function showDetallePais(nombre) {
    console.log("showDetallePais " + nombre);

    return (dispatch, getState) => {
        axios.get('https://api.covid19api.com/country/' + nombre)
            .then((response) => {
                console.log("response showDetallePais " + nombre);
                console.log(response.data )
                dispatch( { type: SHOW_DETALLE_PAIS, payload: response.data } ) 
            }) .catch(error => {
                console.log("error showDetallePais " + nombre);
                console.log(error.response)
                dispatch( { type: SHOW_DETALLE_PAIS, payload: [] } ) 
            });
            
    }
    
} 