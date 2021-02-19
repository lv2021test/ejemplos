import { combineReducers } from 'redux';
import { showPaises } from './paises'
import { showDetallePais } from './pais'

const rootReducer = combineReducers({
  user: showPaises,
  detalle: showDetallePais
});

export default rootReducer;
