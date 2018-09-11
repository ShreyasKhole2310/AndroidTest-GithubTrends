package com.test.shreyas.test_trending_repositories;

import java.io.Serializable;

public class Repository_List implements Serializable{

    /*      "id": 14098069,
      "node_id": "MDEwOlJlcG9zaXRvcnkxNDA5ODA2OQ==",
      "name": "free-programming-books-zh_CN",
      "full_name": "justjavac/free-programming-books-zh_CN",
      "owner": {
        "login": "justjavac",
        "id": 359395,
        "node_id": "MDQ6VXNlcjM1OTM5NQ==",
        "avatar_url": "https://avatars1.githubusercontent.com/u/359395?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/justjavac",
        "html_url": "https://github.com/justjavac",
        "followers_url": "https://api.github.com/users/justjavac/followers",
        "following_url": "https://api.github.com/users/justjavac/following{/other_user}",
        "gists_url": "https://api.github.com/users/justjavac/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/justjavac/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/justjavac/subscriptions",
        "organizations_url": "https://api.github.com/users/justjavac/orgs",
        "repos_url": "https://api.github.com/users/justjavac/repos",
        "events_url": "https://api.github.com/users/justjavac/events{/privacy}",
        "received_events_url": "https://api.github.com/users/justjavac/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/justjavac/free-programming-books-zh_CN",
      "description": ":books: 免费的计算机编程类中文书籍，欢迎投稿",
      "fork": false,
      "url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN",
      "forks_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/forks",
      "keys_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/keys{/key_id}",
      "collaborators_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/collaborators{/collaborator}",
      "teams_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/teams",
      "hooks_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/hooks",
      "issue_events_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/issues/events{/number}",
      "events_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/events",
      "assignees_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/assignees{/user}",
      "branches_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/branches{/default_branch}",
      "tags_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/tags",
      "blobs_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/blobs{/sha}",
      "git_tags_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/tags{/sha}",
      "git_refs_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/refs{/sha}",
      "trees_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/trees{/sha}",
      "statuses_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/statuses/{sha}",
      "languages_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/languages",
      "stargazers_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/stargazers",
      "contributors_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/contributors",
      "subscribers_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/subscribers",
      "subscription_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/subscription",
      "commits_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/commits{/sha}",
      "git_commits_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/commits{/sha}",
      "comments_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/comments{/number}",
      "issue_comment_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/issues/comments{/number}",
      "contents_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/contents/{+path}",
      "compare_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/compare/{base}...{head}",
      "merges_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/merges",
      "archive_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/{archive_format}{/ref}",
      "downloads_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/downloads",
      "issues_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/issues{/number}",
      "pulls_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/pulls{/number}",
      "milestones_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/notifications{?since,all,participating}",
      "labels_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/labels{/name}",
      "releases_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/releases{/id}",
      "deployments_url": "https://api.github.com/repos/justjavac/free-programming-books-zh_CN/deployments",
      "created_at": "2013-11-04T01:59:19Z",
      "updated_at": "2018-09-10T16:07:30Z",
      "pushed_at": "2018-09-08T09:24:30Z",
      "git_url": "git://github.com/justjavac/free-programming-books-zh_CN.git",
      "ssh_url": "git@github.com:justjavac/free-programming-books-zh_CN.git",
      "clone_url": "https://github.com/justjavac/free-programming-books-zh_CN.git",
      "svn_url": "https://github.com/justjavac/free-programming-books-zh_CN",
      "homepage": "http://weibo.com/justjavac",
      "size": 825,
      "stargazers_count": 38391,
      "watchers_count": 38391,
      "language": "JavaScript",
      "has_issues": true,
      "has_projects": true,
      "has_downloads": true,
      "has_wiki": false,
      "has_pages": false,
      "forks_count": 13359,
      "mirror_url": null,
      "archived": false,
      "open_issues_count": 150,
      "license": {
        "key": "gpl-3.0",
        "name": "GNU General Public License v3.0",
        "spdx_id": "GPL-3.0",
        "url": "https://api.github.com/licenses/gpl-3.0",
        "node_id": "MDc6TGljZW5zZTk="
      },
      "forks": 13359,
      "open_issues": 150,
      "watchers": 38391,
      "default_branch": "master",
      "score": 23.69691
    },*/
    public String name, id, full_name, node_id;
    public String forks,open_issues, default_branch, score,html_url;
    public String created_at,updated_at, pushed_at,language,description;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHtml_url() {

        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Repository_List(String name, String id, String full_name, String node_id,
                           String forks, String open_issues, String default_branch, String score,
                           String html_url, String created_at, String updated_at, String pushed_at,
                           String language, String description) {
        this.name = name;
        this.id = id;
        this.full_name = full_name;
        this.node_id = node_id;
        this.forks = forks;
        this.open_issues = open_issues;
        this.default_branch = default_branch;
        this.score = score;
        this.html_url = html_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.pushed_at = pushed_at;
        this.language = language;
        this.description = description;

    }

    public String getRepo_lang() {
        return language;
    }

    public void setRepo_lang(String repo_lang) {
        this.language = repo_lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getForks() {
        return forks;
    }

    public void setForks(String forks) {
        this.forks = forks;
    }

    public String getOpen_issues() {
        return open_issues;
    }

    public void setOpen_issues(String open_issues) {
        this.open_issues = open_issues;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPushed_at() {
        return pushed_at;
    }

    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }
}
