import React from 'react'
import { render } from 'react-dom'
import { createStore, applyMiddleware } from 'redux'
import { Provider } from 'react-redux'
import thunk from 'redux-thunk'



import reducers from './reducers'
import App from "./components/App"




const createStoreWithMiddleware = applyMiddleware(thunk)(createStore);


render(
  <Provider store={createStoreWithMiddleware(reducers) }>
    <App />
  </Provider>,
  document.getElementById('root')
)
