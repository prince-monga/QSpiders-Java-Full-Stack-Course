import React, { Component } from 'react'

export default class LifeCycleCbc extends Component {
    state={count:0}
    componentDidMount(){
        console.log("component is mounted");
    }
    componentDidUpdate(){
        console.log("component is updated");
    }
    componentWillUnmount(){
        console.log("component is unmounted");
    }
  render() {
    return (
      <div>
        <h1>LifeCycleCbc</h1>
        <h2>{this.state.count}</h2>
        <button onClick={()=>this.setState({count:this.state.count+1})}>Increment</button>
        
      </div>
    )
  }
}
