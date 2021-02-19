import React, { Component } from 'react';

import { connect } from 'react-redux';
import { showDetallePais } from '../actions';

import { withRouter } from 'react-router-dom'


import { DataGrid} from '@material-ui/data-grid';

import {  Link as RouterLink } from "react-router-dom";
import Link from '@material-ui/core/Link'

import {
    Button
  } from "@material-ui/core";


class Country extends Component {

    constructor(props) {
        super(props);
    }

    componentDidMount() {

        console.log(  "paramtro" );
        console.log(  this.props.match.params.name  );
        let nombrePais =  this.props.match.params.name ;

      
        this.props.showDetallePais(nombrePais);
         
    } 
    



    render() {
        

        const columns = [
            { field: 'Active', headerName: 'Casos activos', width: 200 },
            { field: 'Confirmed', headerName: 'Casos confirmados', width: 200 },
            { field: 'Deaths', headerName: 'Muertes', width: 200 },
            { field: 'Recovered', headerName: 'Recuperaciones', width: 200 },
            { field: 'Date', headerName: 'Fecha', type: 'date',  width: 200 },
          ];
        
        const rows = this.props.detalle;

        rows.forEach((item, i) => {
            item.id = i + 1;
        });

       

        return (

            <div>
  
                <div>
                    <Button component={RouterLink} to={{pathname:'/' }} color="primary" >Volver</Button> <br/><br/>
                </div>
            
                <div style={{ height: 400, width: '100%' }}>
                    <DataGrid rows={rows} columns={columns} pageSize={10}  />
                </div>

                <div>
                <br/> <br/><Button component={RouterLink} to={{pathname:'/' }} color="primary" >Volver</Button> <br/>
                </div>
          
            </div>


        );
    }
}

//export default Country;

function mapStateToProps(state) {
    return {
      detalle: state.detalle.list
    }
}
  
export default withRouter( connect(mapStateToProps,  { showDetallePais })(Country) );