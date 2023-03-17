//intersection
type draggable={
    drag: ()=>void;
  }
  
  type Resizable={
    resize:()=>void
  }
  
  type UIWidget= draggable & Resizable;  //intersection
  
  let newUI: UIWidget ={
    drag:()=> {
      console.log('Hello');
    },
    resize() {
        console.log('World');
    },
  }