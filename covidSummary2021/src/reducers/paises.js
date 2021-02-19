import { SHOW_PAISES } from '../actions'

const initialState = {
    list: []
}

export function showPaises(state = initialState, action) {
    
    switch (action.type) {
        case SHOW_PAISES:
            return Object.assign({}, state, {list: action.payload})
        default:
            return state 
    }
    
}
