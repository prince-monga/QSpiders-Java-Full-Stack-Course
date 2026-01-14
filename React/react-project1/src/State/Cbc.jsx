import React, { Component } from 'react'

export default class Cbc extends Component {
    state={
        count :0
    }
    increment=()=>{
        this.setState({count:this.state.count+1})
        console.log(this.state.count);
    }
    decrement=()=>{
        this.setState({count:this.state.count-1})
        console.log(this.state.count);
    }
    reset=()=>{
        this.setState({count:0})
        console.log(this.state.count);
    }
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <button onClick={this.increment}>Inceement</button>
           <button onClick={this.decrement}>Decrement</button>
              <button onClick={this.reset}>Reset</button>
      </div>
    )
  }
}
