import { SHOW_DETALLE_PAIS } from '../actions'

const initialState = {
    list: []
}

export function showDetallePais(state = initialState, action) {
    
    switch (action.type) {
        case SHOW_DETALLE_PAIS:
            return Object.assign({}, state, {list: action.payload})
        default:
            return state 
    }
    
}
