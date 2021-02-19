import React, { Component } from "react";
import { Router, Switch, Route } from "react-router-dom";

import Country from "./Country";
import Summary from "./Summary";
import history from './history';


class Routes extends Component {

    constructor(props) {
        super(props);
    }


    render() {
        return (
            <Router history={history}>
                <Switch>
                    <Route exact path="/"  component={Summary} />
                    <Route path="/country/:name" component={Country} />
                </Switch>
            </Router>
        )
    }
}



export default Routes;