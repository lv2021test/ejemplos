import React, { Component } from "react";
import { connect } from 'react-redux';
import { showPaises } from '../actions';

import Container from "@material-ui/core/Container";
import Card from "@material-ui/core/Card";
import Typography from "@material-ui/core/Typography";
import CardContent from "@material-ui/core/CardContent";
import Grid from "@material-ui/core/Grid";
import {  Link as RouterLink } from "react-router-dom";
import Link from '@material-ui/core/Link'

import { withRouter } from 'react-router-dom'

class Summary extends Component {

  constructor(props) {
    super(props);
  }

  componentDidMount() {
    this.props.showPaises()
  } 

  render() {
    return (
      <div>
      <Container>
        <Typography
          color="textPrimary"
          gutterBottom
          variant="h3"
          align="center"
        >
          Información sobre la pandemia de coronavirus en el mundo {" "}
        </Typography>
        <Grid container spacing={3}>
          { 
            
          this.props.paises.map((pais) => (
            <Grid item xs={12} sm={4} key={pais.Country}>

              <Link to={{pathname:'/country/' + pais.Slug  }} underline='none' component={RouterLink}  >
                <Card >
                  <CardContent>

                    <Typography color="primary" variant="h5">
                      {pais.Country}
                    </Typography>

                    <Typography color="textSecondary" variant="subtitle2">
                      Total de casos confirmados: {pais.TotalConfirmed}
                    </Typography>

                    <Typography color="textSecondary" variant="subtitle2">
                      Total de muertes: {pais.TotalDeaths}
                    </Typography>

                    <Typography color="textSecondary" variant="subtitle2">
                      Total de recuperaciones: {pais.TotalRecovered}
                    </Typography>

                  </CardContent>
                </Card>
              </Link>
            </Grid>
          ))}
        </Grid>
      </Container>
    </div>
    );
  }
}

function mapStateToProps(state) {
  return {
    paises: state.user.list
  }
}

export default withRouter( connect(mapStateToProps,  { showPaises })(Summary) );