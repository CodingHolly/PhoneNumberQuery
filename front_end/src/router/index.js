import Vue from 'vue'
import VueRouter from 'vue-router'

import UserLayOut from "@/views/User/UserLayOut.vue";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: UserLayOut
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
